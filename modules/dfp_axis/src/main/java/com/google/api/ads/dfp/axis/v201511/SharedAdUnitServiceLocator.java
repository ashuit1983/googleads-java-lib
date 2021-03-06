/**
 * SharedAdUnitServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201511;

public class SharedAdUnitServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfp.axis.v201511.SharedAdUnitService {

    public SharedAdUnitServiceLocator() {
    }


    public SharedAdUnitServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SharedAdUnitServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SharedAdUnitServiceInterfacePort
    private java.lang.String SharedAdUnitServiceInterfacePort_address = "https://ads.google.com/apis/ads/publisher/v201511/SharedAdUnitService";

    public java.lang.String getSharedAdUnitServiceInterfacePortAddress() {
        return SharedAdUnitServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SharedAdUnitServiceInterfacePortWSDDServiceName = "SharedAdUnitServiceInterfacePort";

    public java.lang.String getSharedAdUnitServiceInterfacePortWSDDServiceName() {
        return SharedAdUnitServiceInterfacePortWSDDServiceName;
    }

    public void setSharedAdUnitServiceInterfacePortWSDDServiceName(java.lang.String name) {
        SharedAdUnitServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.dfp.axis.v201511.SharedAdUnitServiceInterface getSharedAdUnitServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SharedAdUnitServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSharedAdUnitServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.dfp.axis.v201511.SharedAdUnitServiceInterface getSharedAdUnitServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfp.axis.v201511.SharedAdUnitServiceSoapBindingStub _stub = new com.google.api.ads.dfp.axis.v201511.SharedAdUnitServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSharedAdUnitServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSharedAdUnitServiceInterfacePortEndpointAddress(java.lang.String address) {
        SharedAdUnitServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfp.axis.v201511.SharedAdUnitServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfp.axis.v201511.SharedAdUnitServiceSoapBindingStub _stub = new com.google.api.ads.dfp.axis.v201511.SharedAdUnitServiceSoapBindingStub(new java.net.URL(SharedAdUnitServiceInterfacePort_address), this);
                _stub.setPortName(getSharedAdUnitServiceInterfacePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SharedAdUnitServiceInterfacePort".equals(inputPortName)) {
            return getSharedAdUnitServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201511", "SharedAdUnitService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201511", "SharedAdUnitServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SharedAdUnitServiceInterfacePort".equals(portName)) {
            setSharedAdUnitServiceInterfacePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
