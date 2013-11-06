package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

import comm.Message;

import exeception.PeterException;

/**
 * @author Franci 
 * @version 1.0
 * @since November 6, 2013
**/
public interface ClientRMI extends Remote {

	/**
	 * <b>
	 * <p>s% - hostname</p>
	 * <p>s% - number port</p>
	 * <p>s% - name client</p>
	 * </b>
	 **/
	static final String FORMAT_URL_CLIENT = "%s:%s/peter/client/%s";
	
	/**
	 * Connect to server and add it to registry 
	 * 
	 *@param		host String  
	 *@param		port Integer  
	 *@throw		PeterRMIException
	 *@exception	RemoteException
	 **/
	public void conectToServer( String host, Integer port ) throws PeterException;
	
	/**
	 * Connect to server and add it to registry 
	 * 
	 *@param		msg Message
	 *@throw		PeterRMIException
	 *@exception	RemoteException
	 *@see			{@link Message}
	 **/
	public void sendMessage( Message msg ) throws PeterException;
	
	/**
	 * Hostname from client 
	 * 
	 *@return		hostname String
	 **/
	public String getHostname();
	
	/**
	 * Port from client 
	 * 
	 *@return		port Integer
	 **/
	public Integer getPort();
	
	/**
	 * Name from client 
	 * 
	 *@return		port String
	 **/
	public String getName();
}
