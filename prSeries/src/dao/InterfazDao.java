package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DatabaseConnection;


public interface InterfazDao<T> {
	
	/**
	 * Muestra todos los objetos T de la base de datos.
	 * @author Abel
	 * @return un ArrayList de objetos T
	 * @param <T>
	 */

	public ArrayList<T> buscarTodos();
	/**
	 * Muestra el objeto T de la base de datos con el id especificado
	 * 
	 * @param i		el id del objeto T
	 * @return		un objeto T
	 */
	public T buscarPorId(int i);
	/**
	 * Actualiza el objeto T de la base de datos 
	 * 
	 * @param t		un objeto T
	 */
	public void insertar(T t);
	/**
	 * Insertar el objeto T recibido en la base de datos
	 * @param t 	un objeto T
	 */
	public void modificar(T t);
	/**
	 * Elimina el objeto T de la base de datos
	 * @param t 	un objeto T
	 */
	public void borrar(T t);

}
