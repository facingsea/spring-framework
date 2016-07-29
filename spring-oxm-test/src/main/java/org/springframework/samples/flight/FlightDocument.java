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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public abstract interface FlightDocument extends XmlObject {
	//public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((1.class$org$springframework$samples$flight$FlightDocument == null ? (1.class$org$springframework$samples$flight$FlightDocument = 1.class$("org.springframework.samples.flight.FlightDocument")) : 1.class$org$springframework$samples$flight$FlightDocument).getClassLoader(), "schemaorg_apache_xmlbeans.system.s5EF858A5E57B2761C3670716FC0A909C").resolveHandle("flightc6b8doctype");
	public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FlightDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5EF858A5E57B2761C3670716FC0A909C").resolveHandle("flightc6b8doctype");

	public abstract FlightType getFlight();

	public abstract void setFlight(FlightType paramFlightType);

	public abstract FlightType addNewFlight();

	public static final class Factory {
		public static FlightDocument newInstance() {
			return (FlightDocument) XmlBeans.getContextTypeLoader().newInstance(FlightDocument.type, null);
		}

		public static FlightDocument newInstance(XmlOptions paramXmlOptions) {
			return (FlightDocument) XmlBeans.getContextTypeLoader().newInstance(FlightDocument.type, paramXmlOptions);
		}

		public static FlightDocument parse(String paramString) throws XmlException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramString, FlightDocument.type, null);
		}

		public static FlightDocument parse(String paramString, XmlOptions paramXmlOptions) throws XmlException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramString, FlightDocument.type,
					paramXmlOptions);
		}

		public static FlightDocument parse(File paramFile) throws XmlException, IOException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramFile, FlightDocument.type, null);
		}

		public static FlightDocument parse(File paramFile, XmlOptions paramXmlOptions)
				throws XmlException, IOException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramFile, FlightDocument.type,
					paramXmlOptions);
		}

		public static FlightDocument parse(URL paramURL) throws XmlException, IOException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramURL, FlightDocument.type, null);
		}

		public static FlightDocument parse(URL paramURL, XmlOptions paramXmlOptions) throws XmlException, IOException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramURL, FlightDocument.type,
					paramXmlOptions);
		}

		public static FlightDocument parse(InputStream paramInputStream) throws XmlException, IOException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramInputStream, FlightDocument.type, null);
		}

		public static FlightDocument parse(InputStream paramInputStream, XmlOptions paramXmlOptions)
				throws XmlException, IOException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramInputStream, FlightDocument.type,
					paramXmlOptions);
		}

		public static FlightDocument parse(Reader paramReader) throws XmlException, IOException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramReader, FlightDocument.type, null);
		}

		public static FlightDocument parse(Reader paramReader, XmlOptions paramXmlOptions)
				throws XmlException, IOException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramReader, FlightDocument.type,
					paramXmlOptions);
		}

		public static FlightDocument parse(XMLStreamReader paramXMLStreamReader) throws XmlException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramXMLStreamReader, FlightDocument.type,
					null);
		}

		public static FlightDocument parse(XMLStreamReader paramXMLStreamReader, XmlOptions paramXmlOptions)
				throws XmlException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramXMLStreamReader, FlightDocument.type,
					paramXmlOptions);
		}

		public static FlightDocument parse(Node paramNode) throws XmlException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramNode, FlightDocument.type, null);
		}

		public static FlightDocument parse(Node paramNode, XmlOptions paramXmlOptions) throws XmlException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramNode, FlightDocument.type,
					paramXmlOptions);
		}

		/**
		 * @deprecated
		 */
		public static FlightDocument parse(XMLInputStream paramXMLInputStream) throws XmlException, XMLStreamException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramXMLInputStream, FlightDocument.type,
					null);
		}

		/**
		 * @deprecated
		 */
		public static FlightDocument parse(XMLInputStream paramXMLInputStream, XmlOptions paramXmlOptions)
				throws XmlException, XMLStreamException {
			return (FlightDocument) XmlBeans.getContextTypeLoader().parse(paramXMLInputStream, FlightDocument.type,
					paramXmlOptions);
		}

		/**
		 * @deprecated
		 */
		public static XMLInputStream newValidatingXMLInputStream(XMLInputStream paramXMLInputStream)
				throws XmlException, XMLStreamException {
			return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(paramXMLInputStream, FlightDocument.type,
					null);
		}

		/**
		 * @deprecated
		 */
		public static XMLInputStream newValidatingXMLInputStream(XMLInputStream paramXMLInputStream,
				XmlOptions paramXmlOptions) throws XmlException, XMLStreamException {
			return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(paramXMLInputStream, FlightDocument.type,
					paramXmlOptions);
		}
	}
}
