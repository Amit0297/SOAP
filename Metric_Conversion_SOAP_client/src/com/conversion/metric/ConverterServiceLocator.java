/**
 * ConverterServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.conversion.metric;

@SuppressWarnings("serial")
public class ConverterServiceLocator extends org.apache.axis.client.Service implements com.conversion.metric.ConverterService {

    public ConverterServiceLocator() {
    }


    public ConverterServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConverterServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Converter
    private java.lang.String Converter_address = "http://localhost:8080/Metric_Conversion_SOAP/services/Converter";

    public java.lang.String getConverterAddress() {
        return Converter_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConverterWSDDServiceName = "Converter";

    public java.lang.String getConverterWSDDServiceName() {
        return ConverterWSDDServiceName;
    }

    public void setConverterWSDDServiceName(java.lang.String name) {
        ConverterWSDDServiceName = name;
    }

    public com.conversion.metric.Converter getConverter() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Converter_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConverter(endpoint);
    }

    public com.conversion.metric.Converter getConverter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.conversion.metric.ConverterSoapBindingStub _stub = new com.conversion.metric.ConverterSoapBindingStub(portAddress, this);
            _stub.setPortName(getConverterWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConverterEndpointAddress(java.lang.String address) {
        Converter_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(@SuppressWarnings("rawtypes") Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.conversion.metric.Converter.class.isAssignableFrom(serviceEndpointInterface)) {
                com.conversion.metric.ConverterSoapBindingStub _stub = new com.conversion.metric.ConverterSoapBindingStub(new java.net.URL(Converter_address), this);
                _stub.setPortName(getConverterWSDDServiceName());
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
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, @SuppressWarnings("rawtypes") Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Converter".equals(inputPortName)) {
            return getConverter();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://metric.conversion.com", "ConverterService");
    }

    @SuppressWarnings("rawtypes")
	private java.util.HashSet ports = null;

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://metric.conversion.com", "Converter"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Converter".equals(portName)) {
            setConverterEndpointAddress(address);
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
