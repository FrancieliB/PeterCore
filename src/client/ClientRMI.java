package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

import comm.Message;

/**
 * @author Franci 
 * @version 1.2
 * @since November 6, 2013
**/
public interface ClientRMI extends Remote {

	/**
	 * <b>
	 * <p>s% - name client</p>
	 * </b>
	 **/
	static final String FORMAT_URL_CLIENT = "rmi://%s:%s/peter/client/%s";
	
	/**
	 * <b>
	 * <p>s% - name sender</p>
	 * <p>s% - message</p>
	 * </b>
	 **/
	static final String FORMAT_MSG = "s% disse: s%";
	
	/**
	 * Connect to server and add it to registry 
	 * 
	 *@param		host String  
	 *@param		port Integer  
	 *@throw		PeterRMIException
	 **/
	public void conectToServer( String host, Integer port ) throws RemoteException;
	
	/**
	 *Get message from server 
	 * 
	 *@param		msg Message
	 *@throw		PeterRMIException
	 *@see			{@link Message}
	 **/
	public void receiveMessage( Message msg ) throws RemoteException;
	
	/**
	 * Hostname from client 
	 * 
	 *@return		hostname String
	 **/
	public String getHostname() throws RemoteException;
	
	/**
	 * Port from client 
	 * 
	 *@return		port Integer
	 **/
	public Integer getPort() throws RemoteException;
	
	/**
	 * Name from client 
	 * 
	 *@return		port String
	 **/
	public String getName() throws RemoteException;
}
