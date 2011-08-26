/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDisplayNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgDAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgViewBoxAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element draw:marker}.
 *
 */
public class DrawMarkerElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DRAW, "marker");

	/**
	 * Create the instance of <code>DrawMarkerElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawMarkerElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:marker}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDisplayNameAttribute</code> , See {@odf.attribute draw:display-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawDisplayNameAttribute() {
		DrawDisplayNameAttribute attr = (DrawDisplayNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "display-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDisplayNameAttribute</code> , See {@odf.attribute draw:display-name}
	 *
	 * @param drawDisplayNameValue   The type is <code>String</code>
	 */
	public void setDrawDisplayNameAttribute(String drawDisplayNameValue) {
		DrawDisplayNameAttribute attr = new DrawDisplayNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawDisplayNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawNameAttribute() {
		DrawNameAttribute attr = (DrawNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @param drawNameValue   The type is <code>String</code>
	 */
	public void setDrawNameAttribute(String drawNameValue) {
		DrawNameAttribute attr = new DrawNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgDAttribute</code> , See {@odf.attribute svg:d}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgDAttribute() {
		SvgDAttribute attr = (SvgDAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "d");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgDAttribute</code> , See {@odf.attribute svg:d}
	 *
	 * @param svgDValue   The type is <code>String</code>
	 */
	public void setSvgDAttribute(String svgDValue) {
		SvgDAttribute attr = new SvgDAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(svgDValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgViewBoxAttribute</code> , See {@odf.attribute svg:viewBox}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgViewBoxAttribute() {
		SvgViewBoxAttribute attr = (SvgViewBoxAttribute) getOdfAttribute(OdfDocumentNamespace.SVG, "viewBox");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgViewBoxAttribute</code> , See {@odf.attribute svg:viewBox}
	 *
	 * @param svgViewBoxValue   The type is <code>String</code>
	 */
	public void setSvgViewBoxAttribute(String svgViewBoxValue) {
		SvgViewBoxAttribute attr = new SvgViewBoxAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(svgViewBoxValue);
	}

	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}
