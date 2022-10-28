package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DatabaseConnection;


public interface Dao<T> {

	public ArrayList<T> buscarTodos();

	public T buscarPorID(int i);

	public void insertar(T t);

	public void modificar(T t);

	public void borrar(T t);

}
