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
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSXMLDocument extends NSXMLNode {
	static {
		NatJ.register();
	}

	@Generated
	protected NSXMLDocument(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("DTD")
	public native NSXMLDTD DTD();

	@Generated
	@Selector("MIMEType")
	public native String MIMEType();

	@Generated
	@Selector("XMLData")
	public native NSData XMLData();

	@Generated
	@Selector("XMLDataWithOptions:")
	public native NSData XMLDataWithOptions(long options);

	@Generated
	@Selector("addChild:")
	public native void addChild(NSXMLNode child);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSXMLDocument alloc();

	@Generated
	@Selector("characterEncoding")
	public native String characterEncoding();

	@Generated
	@Selector("documentContentKind")
	public native long documentContentKind();

	@Generated
	@Selector("init")
	public native NSXMLDocument init();

	@Generated
	@Selector("initWithContentsOfURL:options:error:")
	public native NSXMLDocument initWithContentsOfURLOptionsError(NSURL url,
			long mask, Ptr<NSError> error);

	@Generated
	@Selector("initWithData:options:error:")
	public native NSXMLDocument initWithDataOptionsError(NSData data,
			long mask, Ptr<NSError> error);

	@Generated
	@Selector("initWithKind:")
	public native NSXMLDocument initWithKind(long kind);

	@Generated
	@Selector("initWithKind:options:")
	public native NSXMLDocument initWithKindOptions(long kind, long options);

	@Generated
	@Selector("initWithRootElement:")
	public native NSXMLDocument initWithRootElement(NSXMLElement element);

	@Generated
	@Selector("initWithXMLString:options:error:")
	public native NSXMLDocument initWithXMLStringOptionsError(String string,
			long mask, Ptr<NSError> error);

	@Generated
	@Selector("insertChild:atIndex:")
	public native void insertChildAtIndex(NSXMLNode child, long index);

	@Generated
	@Selector("insertChildren:atIndex:")
	public native void insertChildrenAtIndex(NSArray children, long index);

	@Generated
	@Selector("isStandalone")
	public native boolean isStandalone();

	@Generated
	@Selector("objectByApplyingXSLT:arguments:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectByApplyingXSLTArgumentsError(NSData xslt,
			NSDictionary arguments, Ptr<NSError> error);

	@Generated
	@Selector("objectByApplyingXSLTAtURL:arguments:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectByApplyingXSLTAtURLArgumentsError(NSURL xsltURL,
			NSDictionary argument, Ptr<NSError> error);

	@Generated
	@Selector("objectByApplyingXSLTString:arguments:error:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectByApplyingXSLTStringArgumentsError(String xslt,
			NSDictionary arguments, Ptr<NSError> error);

	@Generated
	@Selector("removeChildAtIndex:")
	public native void removeChildAtIndex(long index);

	@Generated
	@Selector("replaceChildAtIndex:withNode:")
	public native void replaceChildAtIndexWithNode(long index, NSXMLNode node);

	@Generated
	@Selector("replacementClassForClass:")
	public static native Class replacementClassForClass(Class cls);

	@Generated
	@Selector("rootElement")
	public native NSXMLElement rootElement();

	@Generated
	@Selector("setCharacterEncoding:")
	public native void setCharacterEncoding(String encoding);

	@Generated
	@Selector("setChildren:")
	public native void setChildren(NSArray children);

	@Generated
	@Selector("setDTD:")
	public native void setDTD(NSXMLDTD documentTypeDeclaration);

	@Generated
	@Selector("setDocumentContentKind:")
	public native void setDocumentContentKind(long kind);

	@Generated
	@Selector("setMIMEType:")
	public native void setMIMEType(String MIMEType);

	@Generated
	@Selector("setRootElement:")
	public native void setRootElement(NSXMLNode root);

	@Generated
	@Selector("setStandalone:")
	public native void setStandalone(boolean standalone);

	@Generated
	@Selector("setVersion:")
	public native void setVersion(String version);

	@Generated
	@Selector("validateAndReturnError:")
	public native boolean validateAndReturnError(Ptr<NSError> error);

	@Generated
	@Selector("version")
	public native String version();
}
