package main.java.movie.dao.dao;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import main.java.movie.common.file.model.Movie;

@Repository
@Transactional
public class MovieDaoImp extends HibernateDaoSupport implements IMovieDao {

	@Autowired
	@Qualifier("movieSessionFactory")
	SessionFactory sessionFactory;

	@Autowired
	public void init(SessionFactory factory) {
		setSessionFactory(sessionFactory);
	}

	@PostConstruct
	public void initDao() {
		// getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
	}

	@Override
	public Boolean saveMovies(List<Movie> movies) {
		for (Movie movie : movies) {
			getHibernateTemplate().save(movie);
		}
		return true;
	}

	@Override
	public Boolean deleteMovies(List<Movie> movies) {
		for (Movie movie : movies) {
			getHibernateTemplate().delete(movie);
		}
		return true;
	}

	@Override
	public List<Movie> listMovies() {
		return (List<Movie>) getHibernateTemplate().find("from Movie");
	}

	@Override
	public Movie findMovie(Integer id) {
		Session session = null;
		Movie ret = null;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			SQLQuery query = session.createSQLQuery("select * from movie where id =:id");
			query.setInteger("id", id);
			query.addEntity(Movie.class);
			ret = (Movie) query.list().get(0);

		} catch (RuntimeException e) {
			try {
				logger.error(e.getMessage(), e);
			} catch (RuntimeException rbe) {
				System.out.println("Couldn’t roll back transaction : " + rbe);
			}
		} finally {
			if (session != null) {
				session.close();

			}
		}
		return ret;

	}

	@Override
	public List<String> getMovieType() {
		Session session = null;
		List<String> ret = null;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			String queryString = "select genres1 as MovieType from movie.movie where genres1 != '' group by genres1 union\n" + 
					"select genres2 from movie.movie where genres2 != '' group by genres2 union\n" + 
					"select genres3 from movie.movie where genres3 != '' group by genres3 union\n" + 
					"select genres4 from movie.movie where genres4 != '' group by genres4 union\n" + 
					"select genres5 from movie.movie where genres5 != '' group by genres5 union\n" + 
					"select genres6 from movie.movie where genres6 != '' group by genres6 union\n" + 
					"select genres7 from movie.movie where genres7 != '' group by genres7";
			SQLQuery query = session.createSQLQuery(queryString);
//			query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			ret =  query.list();

		} catch (RuntimeException e) {
			try {
				logger.error(e.getMessage(), e);
			} catch (RuntimeException rbe) {
				System.out.println("Couldn’t roll back transaction : " + rbe);
			}
		} finally {
			if (session != null) {
				session.close();

			}
		}
		return ret;
	}

}
