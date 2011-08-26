/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TablePositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTableAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableMultiDeletionSpannedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableAcceptanceStateAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableRejectingChangeIdAttribute;

import org.odftoolkit.odfdom.dom.element.office.OfficeChangeInfoElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:deletion}.
 *
 */
public abstract class TableDeletionElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TABLE, "deletion" );

	/**
	 * The value set of {@odf.attribute table:type}.
	 */
	 public enum TableTypeAttributeValue {
	 
	 COLUMN( TableTypeAttribute.Value.COLUMN.toString() ), ROW( TableTypeAttribute.Value.ROW.toString() ), TABLE( TableTypeAttribute.Value.TABLE.toString() );
              
		private String mValue;
	 	
		TableTypeAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static TableTypeAttributeValue enumValueOf( String value )
	    {
	        for( TableTypeAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}

	/**
	 * Create the instance of <code>TableDeletionElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDeletionElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:deletion}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableDeletionElement}
	 *
     * @param tableTypeAttributeValue  The mandatory attribute {@odf.attribute  table:type}"
     * @param tablePositionAttributeValue  The mandatory attribute {@odf.attribute  table:position}"
     * @param tableIdAttributeValue  The mandatory attribute {@odf.attribute  table:id}"
     *
	 */
	public void init(String tableTypeAttributeValue, int tablePositionAttributeValue, String tableIdAttributeValue)
	{
		setTablePositionAttribute( Integer.valueOf(tablePositionAttributeValue) );
		setTableIdAttribute( tableIdAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTypeAttribute</code> , See {@odf.attribute table:type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableTypeAttribute()
	{
		TableTypeAttribute attr = (TableTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTypeAttribute</code> , See {@odf.attribute table:type}
	 *
	 * @param tableTypeValue   The type is <code>String</code>
	 */
	public void setTableTypeAttribute( String tableTypeValue )
	{
		TableTypeAttribute attr =  new TableTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TablePositionAttribute</code> , See {@odf.attribute table:position}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTablePositionAttribute()
	{
		TablePositionAttribute attr = (TablePositionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "position" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TablePositionAttribute</code> , See {@odf.attribute table:position}
	 *
	 * @param tablePositionValue   The type is <code>Integer</code>
	 */
	public void setTablePositionAttribute( Integer tablePositionValue )
	{
		TablePositionAttribute attr =  new TablePositionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( tablePositionValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTableAttribute</code> , See {@odf.attribute table:table}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableTableAttribute()
	{
		TableTableAttribute attr = (TableTableAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "table" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTableAttribute</code> , See {@odf.attribute table:table}
	 *
	 * @param tableTableValue   The type is <code>Integer</code>
	 */
	public void setTableTableAttribute( Integer tableTableValue )
	{
		TableTableAttribute attr =  new TableTableAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( tableTableValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableMultiDeletionSpannedAttribute</code> , See {@odf.attribute table:multi-deletion-spanned}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableMultiDeletionSpannedAttribute()
	{
		TableMultiDeletionSpannedAttribute attr = (TableMultiDeletionSpannedAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "multi-deletion-spanned" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableMultiDeletionSpannedAttribute</code> , See {@odf.attribute table:multi-deletion-spanned}
	 *
	 * @param tableMultiDeletionSpannedValue   The type is <code>Integer</code>
	 */
	public void setTableMultiDeletionSpannedAttribute( Integer tableMultiDeletionSpannedValue )
	{
		TableMultiDeletionSpannedAttribute attr =  new TableMultiDeletionSpannedAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( tableMultiDeletionSpannedValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableIdAttribute</code> , See {@odf.attribute table:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableIdAttribute()
	{
		TableIdAttribute attr = (TableIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIdAttribute</code> , See {@odf.attribute table:id}
	 *
	 * @param tableIdValue   The type is <code>String</code>
	 */
	public void setTableIdAttribute( String tableIdValue )
	{
		TableIdAttribute attr =  new TableIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableAcceptanceStateAttribute</code> , See {@odf.attribute table:acceptance-state}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableAcceptanceStateAttribute()
	{
		TableAcceptanceStateAttribute attr = (TableAcceptanceStateAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "acceptance-state" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return TableAcceptanceStateAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableAcceptanceStateAttribute</code> , See {@odf.attribute table:acceptance-state}
	 *
	 * @param tableAcceptanceStateValue   The type is <code>String</code>
	 */
	public void setTableAcceptanceStateAttribute( String tableAcceptanceStateValue )
	{
		TableAcceptanceStateAttribute attr =  new TableAcceptanceStateAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableAcceptanceStateValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableRejectingChangeIdAttribute</code> , See {@odf.attribute table:rejecting-change-id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableRejectingChangeIdAttribute()
	{
		TableRejectingChangeIdAttribute attr = (TableRejectingChangeIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TABLE), "rejecting-change-id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableRejectingChangeIdAttribute</code> , See {@odf.attribute table:rejecting-change-id}
	 *
	 * @param tableRejectingChangeIdValue   The type is <code>String</code>
	 */
	public void setTableRejectingChangeIdAttribute( String tableRejectingChangeIdValue )
	{
		TableRejectingChangeIdAttribute attr =  new TableRejectingChangeIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableRejectingChangeIdValue );
	}

	/**
	 * Create child element {@odf.element office:change-info}.
	 *
	 * @return   return  the element {@odf.element office:change-info}
	 * DifferentQName 
	 */
	public OfficeChangeInfoElement newOfficeChangeInfoElement()
	{
		OfficeChangeInfoElement  officeChangeInfo = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeChangeInfoElement.class);
		this.appendChild( officeChangeInfo);
		return  officeChangeInfo;
	}                   
               
	/**
	 * Create child element {@odf.element table:dependencies}.
	 *
	 * @return   return  the element {@odf.element table:dependencies}
	 * DifferentQName 
	 */
	public TableDependenciesElement newTableDependenciesElement()
	{
		TableDependenciesElement  tableDependencies = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDependenciesElement.class);
		this.appendChild( tableDependencies);
		return  tableDependencies;
	}                   
               
	/**
	 * Create child element {@odf.element table:deletions}.
	 *
	 * @return   return  the element {@odf.element table:deletions}
	 * DifferentQName 
	 */
	public TableDeletionsElement newTableDeletionsElement()
	{
		TableDeletionsElement  tableDeletions = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDeletionsElement.class);
		this.appendChild( tableDeletions);
		return  tableDeletions;
	}                   
               
	/**
	 * Create child element {@odf.element table:cut-offs}.
	 *
	 * @return   return  the element {@odf.element table:cut-offs}
	 * DifferentQName 
	 */
	public TableCutOffsElement newTableCutOffsElement()
	{
		TableCutOffsElement  tableCutOffs = ((OdfFileDom)this.ownerDocument).newOdfElement(TableCutOffsElement.class);
		this.appendChild( tableCutOffs);
		return  tableCutOffs;
	}                   
               
}