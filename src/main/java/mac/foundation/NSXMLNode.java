/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSXMLNode extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSXMLNode(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("DTDNodeWithXMLString:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object DTDNodeWithXMLString(String string);

	@Generated
	@Selector("URI")
	public native String URI();

	@Generated
	@Selector("XMLString")
	public native String XMLString();

	@Generated
	@Selector("XMLStringWithOptions:")
	public native String XMLStringWithOptions(long options);

	@Generated
	@Selector("XPath")
	public native String XPath();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSXMLNode alloc();

	@Generated
	@Selector("attributeWithName:URI:stringValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object attributeWithNameURIStringValue(String name,
			String URI, String stringValue);

	@Generated
	@Selector("attributeWithName:stringValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object attributeWithNameStringValue(String name,
			String stringValue);

	@Generated
	@Selector("canonicalXMLStringPreservingComments:")
	public native String canonicalXMLStringPreservingComments(boolean comments);

	@Generated
	@Selector("childAtIndex:")
	public native NSXMLNode childAtIndex(long index);

	@Generated
	@Selector("childCount")
	public native long childCount();

	@Generated
	@Selector("children")
	public native NSArray children();

	@Generated
	@Selector("commentWithStringValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object commentWithStringValue(String stringValue);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("description")
	public native String description();

	@Generated
	@Selector("detach")
	public native void detach();

	@Generated
	@Selector("document")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object document();

	@Generated
	@Selector("documentWithRootElement:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object documentWithRootElement(NSXMLElement element);

	@Generated
	@Selector("elementWithName:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object elementWithName(String name);

	@Generated
	@Selector("elementWithName:URI:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object elementWithNameURI(String name, String URI);

	@Generated
	@Selector("elementWithName:children:attributes:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object elementWithNameChildrenAttributes(String name,
			NSArray children, NSArray attributes);

	@Generated
	@Selector("elementWithName:stringValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object elementWithNameStringValue(String name,
			String string);

	@Generated
	@Selector("index")
	public native long index();

	@Generated
	@Selector("init")
	public native NSXMLNode init();

	@Generated
	@Selector("initWithKind:")
	public native NSXMLNode initWithKind(long kind);

	@Generated
	@Selector("initWithKind:options:")
	public native NSXMLNode initWithKindOptions(long kind, long options);

	@Generated
	@Selector("kind")
	public native long kind();

	@Generated
	@Selector("level")
	public native long level();

	@Generated
	@Selector("localName")
	public native String localName();

	@Generated
	@Selector("localNameForName:")
	public static native String localNameForName(String name);

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("namespaceWithName:stringValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object namespaceWithNameStringValue(String name,
			String stringValue);

	@Generated
	@Selector("nextNode")
	public native NSXMLNode nextNode();

	@Generated
	@Selector("nextSibling")
	public native NSXMLNode nextSibling();

	@Generated
	@Selector("nodesForXPath:error:")
	public native NSArray nodesForXPathError(String xpath, Ptr<NSError> error);

	@Generated
	@Selector("objectValue")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectValue();

	@Generated
	@Selector("objectsForXQuery:constants:error:")
	public native NSArray objectsForXQueryConstantsError(String xquery,
			NSDictionary constants, Ptr<NSError> error);

	@Generated
	@Selector("objectsForXQuery:error:")
	public native NSArray objectsForXQueryError(String xquery,
			Ptr<NSError> error);

	@Generated
	@Selector("parent")
	public native NSXMLNode parent();

	@Generated
	@Selector("predefinedNamespaceForPrefix:")
	public static native NSXMLNode predefinedNamespaceForPrefix(String name);

	@Generated
	@Selector("prefix")
	public native String prefix();

	@Generated
	@Selector("prefixForName:")
	public static native String prefixForName(String name);

	@Generated
	@Selector("previousNode")
	public native NSXMLNode previousNode();

	@Generated
	@Selector("previousSibling")
	public native NSXMLNode previousSibling();

	@Generated
	@Selector("processingInstructionWithName:stringValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object processingInstructionWithNameStringValue(
			String name, String stringValue);

	@Generated
	@Selector("rootDocument")
	public native NSXMLDocument rootDocument();

	@Generated
	@Selector("setName:")
	public native void setName(String name);

	@Generated
	@Selector("setObjectValue:")
	public native void setObjectValue(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setStringValue:")
	public native void setStringValue(String string);

	@Generated
	@Selector("setStringValue:resolvingEntities:")
	public native void setStringValueResolvingEntities(String string,
			boolean resolve);

	@Generated
	@Selector("setURI:")
	public native void setURI(String URI);

	@Generated
	@Selector("stringValue")
	public native String stringValue();

	@Generated
	@Selector("textWithStringValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object textWithStringValue(String stringValue);
}
