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
