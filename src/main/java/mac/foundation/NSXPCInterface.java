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
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSXPCInterface extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSXPCInterface(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSXPCInterface alloc();

	@Generated
	@Selector("classesForSelector:argumentIndex:ofReply:")
	public native NSSet classesForSelectorArgumentIndexOfReply(SEL sel,
			long arg, boolean ofReply);

	@Generated
	@Selector("init")
	public native NSXPCInterface init();

	@Generated
	@Selector("interfaceForSelector:argumentIndex:ofReply:")
	public native NSXPCInterface interfaceForSelectorArgumentIndexOfReply(
			SEL sel, long arg, boolean ofReply);

	@Generated
	@Selector("setClasses:forSelector:argumentIndex:ofReply:")
	public native void setClassesForSelectorArgumentIndexOfReply(NSSet classes,
			SEL sel, long arg, boolean ofReply);

	@Generated
	@Selector("setInterface:forSelector:argumentIndex:ofReply:")
	public native void setInterfaceForSelectorArgumentIndexOfReply(
			NSXPCInterface ifc, SEL sel, long arg, boolean ofReply);
}
