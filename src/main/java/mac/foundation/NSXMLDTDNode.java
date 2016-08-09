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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSXMLDTDNode extends NSXMLNode {
	static {
		NatJ.register();
	}

	@Generated
	protected NSXMLDTDNode(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("DTDKind")
	public native long DTDKind();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSXMLDTDNode alloc();

	@Generated
	@Selector("init")
	public native NSXMLDTDNode init();

	@Generated
	@Selector("initWithKind:")
	public native NSXMLDTDNode initWithKind(long kind);

	@Generated
	@Selector("initWithKind:options:")
	public native NSXMLDTDNode initWithKindOptions(long kind, long options);

	@Generated
	@Selector("initWithXMLString:")
	public native NSXMLDTDNode initWithXMLString(String string);

	@Generated
	@Selector("isExternal")
	public native boolean isExternal();

	@Generated
	@Selector("notationName")
	public native String notationName();

	@Generated
	@Selector("publicID")
	public native String publicID();

	@Generated
	@Selector("setDTDKind:")
	public native void setDTDKind(long kind);

	@Generated
	@Selector("setNotationName:")
	public native void setNotationName(String notationName);

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
