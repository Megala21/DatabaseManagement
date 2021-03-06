/*
 tour_code	INT,
 start_date	DATE,
 driver_id	INT,
 driver_name		VARCHAR(30) NOT NULL,
 route_id	INT,
 coach_id	INT,
 executed	VARCHAR(45),
 PRIMARY KEY	(tour_code),
 FOREIGN KEY (route_id) REFERENCES route (id) ON DELETE CASCADE ON UPDATE CASCADE,
 FOREIGN KEY (driver_id,driver_name) REFERENCES driver (id,name) ON DELETE CASCADE ON UPDATE CASCADE,
 FOREIGN KEY (coach_id) REFERENCES coach (reg_no) ON DELETE CASCADE ON UPDATE CASCADE
 */
package db.dao;

import db.entity.Hotel;
import db.entity.Tour;
import db.util.HibernateUtil;
import java.awt.HeadlessException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gobinath
 */
public class TourDAO {

    public boolean addTour(Tour tour) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (session == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(tour);
            session.flush();
            transaction.commit();
            return true;
        } catch (HibernateException | HeadlessException ex) {
            if (transaction != null && transaction.wasCommitted()) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return false;
    }

    public boolean updateTour(Tour tour) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (session == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(tour);
            session.flush();
            transaction.commit();
            return true;
        } catch (HibernateException | HeadlessException ex) {
            if (transaction != null && transaction.wasCommitted()) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return false;
    }

    public boolean deleteTour(Tour tour) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (session == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(tour);
            session.flush();
            transaction.commit();
            return true;
        } catch (HibernateException | HeadlessException ex) {
            if (transaction != null && transaction.wasCommitted()) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return false;
    }

    public List<Tour> getAllTours() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (session == null) {
            return null;
        }
        Transaction transaction = null;
        try {
            String HQLQuery = "FROM Tour t ";
            Query query = session.createQuery(HQLQuery);
            List<Tour> tours = query.list();
            return tours;
        } catch (HibernateException | HeadlessException ex) {
            if (transaction != null && transaction.wasCommitted()) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return null;
    }

    public Tour getTour(int tourCode) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (session == null) {
            return null;
        }
        Transaction transaction = null;
        try {
            String HQLQuery = "FROM Tour t WHERE t.tourCode = :idValue";

            Query query = session.createQuery(HQLQuery);
            query.setParameter("idValue", tourCode);
            Object tour = query.uniqueResult();

            if (tour != null && tour instanceof Tour) {
                return (Tour) tour;
            }
        } catch (HibernateException | HeadlessException ex) {
            if (transaction != null && transaction.wasCommitted()) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return null;
    }
    
     public List<Tour> getTours(int code) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (session == null) {
            return null;
        }
        Transaction transaction = null;
        try {
            String HQLQuery = "FROM Tour t WHERE t.tourCode = :idValue";
            Query query = session.createQuery(HQLQuery);

            query.setParameter("idValue", code);
            List<Tour> tours = query.list();
            return tours;
        } catch (HibernateException | HeadlessException ex) {
            if (transaction != null && transaction.wasCommitted()) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return null;
    }
}
