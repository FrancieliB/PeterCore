package server;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

import client.ClientRMI;
import comm.Message;

/**
 * @author Franci 
 * @version 1.1
 * @since November 6, 2013
**/
public interface ServerRMI extends Remote {
	
	/**
	 * <b>
	 * <p>%s - hostname from server</p>
	 * <p>%s - number port from server</p>
	 * </b>
	 **/
	static final String FORMAT_URL_SERVER = "rmi://%s:%s/peter-server";
	
	/**
	 * Add the client to registry, for future callback
	 * 
	 * 
	 *@param		client ClientRMI 
	 *@throw		PeterRMIException
	 *@see			{@link ClientRMI}
	 **/
	public void registryClientForCallBack( ClientRMI client ) throws RemoteException;
	
	/**
	 * Remove the client from registry
	 * 
	 *@param		ClientRMI
	 *@throw		PeterRMIException
	 *@see			{@link ClientRMI}
	 **/
	public void disconnectClient( ClientRMI client ) throws RemoteException;
	
	/**
	 * List all connected clients
	 * 
	 *@return		Stirng[]
	 *@throw		PeterRMIException
	 **/
	public String[] list() throws RemoteException;
	
	/**
	 * Send message for a client
	 * 
	 *@param		msg Message
	 *@throw		PeterRMIException
	 *@see			{@link Message}
	 **/
	public void sendMessage( Message msg ) throws RemoteException;
	
}
