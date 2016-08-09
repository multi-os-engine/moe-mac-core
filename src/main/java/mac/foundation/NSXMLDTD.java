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
public class NSXMLDTD extends NSXMLNode {
	static {
		NatJ.register();
	}

	@Generated
	protected NSXMLDTD(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addChild:")
	public native void addChild(NSXMLNode child);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSXMLDTD alloc();

	@Generated
	@Selector("attributeDeclarationForName:elementName:")
	public native NSXMLDTDNode attributeDeclarationForNameElementName(
			String name, String elementName);

	@Generated
	@Selector("elementDeclarationForName:")
	public native NSXMLDTDNode elementDeclarationForName(String name);

	@Generated
	@Selector("entityDeclarationForName:")
	public native NSXMLDTDNode entityDeclarationForName(String name);

	@Generated
	@Selector("init")
	public native NSXMLDTD init();

	@Generated
	@Selector("initWithContentsOfURL:options:error:")
	public native NSXMLDTD initWithContentsOfURLOptionsError(NSURL url,
			long mask, Ptr<NSError> error);

	@Generated
	@Selector("initWithData:options:error:")
	public native NSXMLDTD initWithDataOptionsError(NSData data, long mask,
			Ptr<NSError> error);

	@Generated
	@Selector("initWithKind:")
	public native NSXMLDTD initWithKind(long kind);

	@Generated
	@Selector("initWithKind:options:")
	public native NSXMLDTD initWithKindOptions(long kind, long options);

	@Generated
	@Selector("insertChild:atIndex:")
	public native void insertChildAtIndex(NSXMLNode child, long index);

	@Generated
	@Selector("insertChildren:atIndex:")
	public native void insertChildrenAtIndex(NSArray children, long index);

	@Generated
	@Selector("notationDeclarationForName:")
	public native NSXMLDTDNode notationDeclarationForName(String name);

	@Generated
	@Selector("predefinedEntityDeclarationForName:")
	public static native NSXMLDTDNode predefinedEntityDeclarationForName(
			String name);

	@Generated
	@Selector("publicID")
	public native String publicID();

	@Generated
	@Selector("removeChildAtIndex:")
	public native void removeChildAtIndex(long index);

	@Generated
	@Selector("replaceChildAtIndex:withNode:")
	public native void replaceChildAtIndexWithNode(long index, NSXMLNode node);

	@Generated
	@Selector("setChildren:")
	public native void setChildren(NSArray children);

	@Generated
	@Selector("setPublicID:")
	public native void setPublicID(String publicID);

	@Generated
	@Selector("setSystemID:")
	public native void setSystemID(String systemID);

	@Generated
	@Selector("systemID")
	public native String systemID();
}
