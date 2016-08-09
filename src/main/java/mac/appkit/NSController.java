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

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSController extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSController alloc();

	@Generated
	@Selector("commitEditing")
	public native boolean commitEditing();

	@Generated
	@Selector("commitEditingWithDelegate:didCommitSelector:contextInfo:")
	public native void commitEditingWithDelegateDidCommitSelectorContextInfo(
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didCommitSelector, VoidPtr contextInfo);

	@Generated
	@Selector("discardEditing")
	public native void discardEditing();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSController init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isEditing")
	public native boolean isEditing();

	@Generated
	@Selector("objectDidBeginEditing:")
	public native void objectDidBeginEditing(
			@Mapped(ObjCObjectMapper.class) Object editor);

	@Generated
	@Selector("objectDidEndEditing:")
	public native void objectDidEndEditing(
			@Mapped(ObjCObjectMapper.class) Object editor);
}
