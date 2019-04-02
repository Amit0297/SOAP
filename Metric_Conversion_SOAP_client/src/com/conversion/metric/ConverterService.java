/**
 * ConverterService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.conversion.metric;

public interface ConverterService extends javax.xml.rpc.Service {
    public java.lang.String getConverterAddress();

    public com.conversion.metric.Converter getConverter() throws javax.xml.rpc.ServiceException;

    public com.conversion.metric.Converter getConverter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
