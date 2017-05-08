package practica2;

import java.util.List;
import modelo.*;
import org.hibernate.*;

/**
 *
 * @author usuario
 */
public class ManejaExperto {

    private Session sesion;
    private Transaction tran;

    public ManejaExperto() {

    }

    public void inicioOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tran = sesion.beginTransaction();
        System.out.println("Operacion iniciada.");
    }

    public void guardaExperto(Experto experto) {
        System.out.println("****** INSERTAR UN NUEVO EXPERTO ******");
        try {
            inicioOperacion();
            sesion.save(experto);
            System.out.println("Experto insertado correctamente");
        } catch (HibernateException he) {
            throw he;
        } finally {
            finalizaOperacion();
        }
    }

    public void eliminaExperto(Experto experto) {
        System.out.println("****** ELIMINA EXPERTO ******");
        try {
            inicioOperacion();
            sesion.delete(experto);
            System.out.println("Experto borrado correctamente");
        } catch (HibernateException he) {
            throw he;
        } finally {
            finalizaOperacion();
        }
    }

    public void actualizaExperto(Experto experto) {
        System.out.println("****** ACTUALIZA EXPERTO ******");
        try {
            inicioOperacion();
            sesion.update(experto);
            System.out.println("Experto actualizado correctamente");
        } catch (HibernateException he) {
            throw he;
        } finally {
            finalizaOperacion();
        }
    }

    public Experto obtenExperto(String idExperto) {
        System.out.println("****** OBTENER EXPERTO ******");
        try {
            inicioOperacion();
            return (Experto) sesion.get(Experto.class, idExperto);
        } catch (HibernateException he) {
            throw he;
        } finally {
            finalizaOperacion();
        }
    }

    public void obtenNombreYEspecialidad() {
        System.out.println("****** OBTENER NOMBRE Y ESPECIALIDAD ******");
        try {
            inicioOperacion();

            String consulta = "SELECT e.nombre, e.especialidad FROM experto as e";
            Query query = sesion.createSQLQuery(consulta);
            List<Object[]> ex = query.list();

            for (int i = 0; i < ex.size(); i++) {
                System.out.println("Nombre: " + ex.get(i)[0] + " - Especialidad: " + ex.get(i)[1]);
            }

        } catch (HibernateException he) {
            throw he;

        } finally {
            finalizaOperacion();
        }
    }

    public void listaConParametro(String keyword) {
        System.out.println("****** OBTENER LISTA ******");
        try {
            inicioOperacion();

            String consulta = "SELECT e.nombre FROM experto e WHERE e.especialidad='" + keyword + "'";
            Query query = sesion.createSQLQuery(consulta);
            List ex = query.list();

            for (int i = 0; i < ex.size(); i++) {
                System.out.println("Nombre: " + ex.get(i));
            }

        } catch (HibernateException he) {
            throw he;

        } finally {
            finalizaOperacion();
        }
    }

    public void obtenCasos() {
        System.out.println("****** OBTENER CASOS ******");
        try {
            inicioOperacion();

            String consulta = "SELECT DISTINCT e.nombre, cp.nombre FROM caso_policial cp "
                    + " INNER JOIN colabora c INNER JOIN experto e";
            Query query = sesion.createSQLQuery(consulta);
            List<Object[]> c = query.list();

            for (int i = 0; i < c.size(); i++) {
                System.out.println("Nombre: " + c.get(i)[0] + " - Caso: " + c.get(i)[1]);
            }

        } catch (HibernateException he) {
            throw he;

        } finally {
            finalizaOperacion();
        }
    }

    public void finalizaOperacion() {
        tran.commit();
        sesion.close();
        System.out.println("****** OPERACION FINALIZADA ******");
    }
}
