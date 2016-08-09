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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSXMLElement extends NSXMLNode {
	static {
		NatJ.register();
	}

	@Generated
	protected NSXMLElement(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addAttribute:")
	public native void addAttribute(NSXMLNode attribute);

	@Generated
	@Selector("addChild:")
	public native void addChild(NSXMLNode child);

	@Generated
	@Selector("addNamespace:")
	public native void addNamespace(NSXMLNode aNamespace);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSXMLElement alloc();

	@Generated
	@Selector("attributeForLocalName:URI:")
	public native NSXMLNode attributeForLocalNameURI(String localName,
			String URI);

	@Generated
	@Selector("attributeForName:")
	public native NSXMLNode attributeForName(String name);

	@Generated
	@Selector("attributes")
	public native NSArray attributes();

	@Generated
	@Selector("elementsForLocalName:URI:")
	public native NSArray elementsForLocalNameURI(String localName, String URI);

	@Generated
	@Selector("elementsForName:")
	public native NSArray elementsForName(String name);

	@Generated
	@Selector("init")
	public native NSXMLElement init();

	@Generated
	@Selector("initWithKind:")
	public native NSXMLElement initWithKind(long kind);

	@Generated
	@Selector("initWithKind:options:")
	public native NSXMLElement initWithKindOptions(long kind, long options);

	@Generated
	@Selector("initWithName:")
	public native NSXMLElement initWithName(String name);

	@Generated
	@Selector("initWithName:URI:")
	public native NSXMLElement initWithNameURI(String name, String URI);

	@Generated
	@Selector("initWithName:stringValue:")
	public native NSXMLElement initWithNameStringValue(String name,
			String string);

	@Generated
	@Selector("initWithXMLString:error:")
	public native NSXMLElement initWithXMLStringError(String string,
			Ptr<NSError> error);

	@Generated
	@Selector("insertChild:atIndex:")
	public native void insertChildAtIndex(NSXMLNode child, long index);

	@Generated
	@Selector("insertChildren:atIndex:")
	public native void insertChildrenAtIndex(NSArray children, long index);

	@Generated
	@Selector("namespaceForPrefix:")
	public native NSXMLNode namespaceForPrefix(String name);

	@Generated
	@Selector("namespaces")
	public native NSArray namespaces();

	@Generated
	@Selector("normalizeAdjacentTextNodesPreservingCDATA:")
	public native void normalizeAdjacentTextNodesPreservingCDATA(
			boolean preserve);

	@Generated
	@Selector("removeAttributeForName:")
	public native void removeAttributeForName(String name);

	@Generated
	@Selector("removeChildAtIndex:")
	public native void removeChildAtIndex(long index);

	@Generated
	@Selector("removeNamespaceForPrefix:")
	public native void removeNamespaceForPrefix(String name);

	@Generated
	@Selector("replaceChildAtIndex:withNode:")
	public native void replaceChildAtIndexWithNode(long index, NSXMLNode node);

	@Generated
	@Selector("resolveNamespaceForName:")
	public native NSXMLNode resolveNamespaceForName(String name);

	@Generated
	@Selector("resolvePrefixForNamespaceURI:")
	public native String resolvePrefixForNamespaceURI(String namespaceURI);

	@Generated
	@Selector("setAttributes:")
	public native void setAttributes(NSArray attributes);

	@Generated
	@Selector("setAttributesAsDictionary:")
	public native void setAttributesAsDictionary(NSDictionary attributes);

	@Generated
	@Selector("setAttributesWithDictionary:")
	public native void setAttributesWithDictionary(NSDictionary attributes);

	@Generated
	@Selector("setChildren:")
	public native void setChildren(NSArray children);

	@Generated
	@Selector("setNamespaces:")
	public native void setNamespaces(NSArray namespaces);
}
