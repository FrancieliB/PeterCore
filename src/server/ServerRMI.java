package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import client.ClientRMI;
import exeception.PeterException;

/**
 * @author Franci 
 * @version 1.0
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
	 *@exception	RemoteException
	 *@see			{@link ClientRMI}
	 **/
	public void registryClientForCallBack( ClientRMI client ) throws PeterException;
	
	/**
	 * Remove the client from registry
	 * 
	 *@param		ClientRMI
	 *@throw		PeterRMIException
	 *@exception	RemoteException
	 *@see			{@link ClientRMI}
	 **/
	public void disconnectClient( ClientRMI client ) throws PeterException;
	
}
