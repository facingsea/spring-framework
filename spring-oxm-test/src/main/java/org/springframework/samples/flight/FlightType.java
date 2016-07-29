package org.springframework.samples.flight;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.SchemaTypeSystem;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlLong;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public abstract interface FlightType extends XmlObject {
	//public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((1.class$org$springframework$samples$flight$FlightType == null ? (1.class$org$springframework$samples$flight$FlightType = 1.class$("org.springframework.samples.flight.FlightType")) : 1.class$org$springframework$samples$flight$FlightType).getClassLoader(), "schemaorg_apache_xmlbeans.system.s5EF858A5E57B2761C3670716FC0A909C").resolveHandle("flighttype4702type");
	public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FlightType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5EF858A5E57B2761C3670716FC0A909C").resolveHandle("flighttype4702type");

	public abstract long getNumber();

	public abstract XmlLong xgetNumber();

	public abstract void setNumber(long paramLong);

	public abstract void xsetNumber(XmlLong paramXmlLong);

	public static final class Factory {
		public static FlightType newInstance() {
			return (FlightType) XmlBeans.getContextTypeLoader().newInstance(FlightType.type, null);
		}

		public static FlightType newInstance(XmlOptions paramXmlOptions) {
			return (FlightType) XmlBeans.getContextTypeLoader().newInstance(FlightType.type, paramXmlOptions);
		}

		public static FlightType parse(String paramString) throws XmlException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramString, FlightType.type, null);
		}

		public static FlightType parse(String paramString, XmlOptions paramXmlOptions) throws XmlException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramString, FlightType.type, paramXmlOptions);
		}

		public static FlightType parse(File paramFile) throws XmlException, IOException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramFile, FlightType.type, null);
		}

		public static FlightType parse(File paramFile, XmlOptions paramXmlOptions) throws XmlException, IOException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramFile, FlightType.type, paramXmlOptions);
		}

		public static FlightType parse(URL paramURL) throws XmlException, IOException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramURL, FlightType.type, null);
		}

		public static FlightType parse(URL paramURL, XmlOptions paramXmlOptions) throws XmlException, IOException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramURL, FlightType.type, paramXmlOptions);
		}

		public static FlightType parse(InputStream paramInputStream) throws XmlException, IOException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramInputStream, FlightType.type, null);
		}

		public static FlightType parse(InputStream paramInputStream, XmlOptions paramXmlOptions)
				throws XmlException, IOException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramInputStream, FlightType.type,
					paramXmlOptions);
		}

		public static FlightType parse(Reader paramReader) throws XmlException, IOException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramReader, FlightType.type, null);
		}

		public static FlightType parse(Reader paramReader, XmlOptions paramXmlOptions)
				throws XmlException, IOException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramReader, FlightType.type, paramXmlOptions);
		}

		public static FlightType parse(XMLStreamReader paramXMLStreamReader) throws XmlException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramXMLStreamReader, FlightType.type, null);
		}

		public static FlightType parse(XMLStreamReader paramXMLStreamReader, XmlOptions paramXmlOptions)
				throws XmlException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramXMLStreamReader, FlightType.type,
					paramXmlOptions);
		}

		public static FlightType parse(Node paramNode) throws XmlException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramNode, FlightType.type, null);
		}

		public static FlightType parse(Node paramNode, XmlOptions paramXmlOptions) throws XmlException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramNode, FlightType.type, paramXmlOptions);
		}

		/**
		 * @deprecated
		 */
		public static FlightType parse(XMLInputStream paramXMLInputStream) throws XmlException, XMLStreamException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramXMLInputStream, FlightType.type, null);
		}

		/**
		 * @deprecated
		 */
		public static FlightType parse(XMLInputStream paramXMLInputStream, XmlOptions paramXmlOptions)
				throws XmlException, XMLStreamException {
			return (FlightType) XmlBeans.getContextTypeLoader().parse(paramXMLInputStream, FlightType.type,
					paramXmlOptions);
		}

		/**
		 * @deprecated
		 */
		public static XMLInputStream newValidatingXMLInputStream(XMLInputStream paramXMLInputStream)
				throws XmlException, XMLStreamException {
			return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(paramXMLInputStream, FlightType.type,
					null);
		}

		/**
		 * @deprecated
		 */
		public static XMLInputStream newValidatingXMLInputStream(XMLInputStream paramXMLInputStream,
				XmlOptions paramXmlOptions) throws XmlException, XMLStreamException {
			return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(paramXMLInputStream, FlightType.type,
					paramXmlOptions);
		}
	}
}
