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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coreservices.struct.AEDesc;
import mac.foundation.opaque.NSAppleEventManagerSuspensionID;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAppleEventManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSAppleEventManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSAppleEventManager alloc();

	@Generated
	@Selector("appleEventForSuspensionID:")
	public native NSAppleEventDescriptor appleEventForSuspensionID(
			NSAppleEventManagerSuspensionID suspensionID);

	@Generated
	@Selector("currentAppleEvent")
	public native NSAppleEventDescriptor currentAppleEvent();

	@Generated
	@Selector("currentReplyAppleEvent")
	public native NSAppleEventDescriptor currentReplyAppleEvent();

	@Generated
	@Selector("dispatchRawAppleEvent:withRawReply:handlerRefCon:")
	public native short dispatchRawAppleEventWithRawReplyHandlerRefCon(
			@UncertainArgument("Options: reference, array Fallback: reference") AEDesc theAppleEvent,
			@UncertainArgument("Options: reference, array Fallback: reference") AEDesc theReply,
			VoidPtr handlerRefCon);

	@Generated
	@Selector("init")
	public native NSAppleEventManager init();

	@Generated
	@Selector("removeEventHandlerForEventClass:andEventID:")
	public native void removeEventHandlerForEventClassAndEventID(
			int eventClass, int eventID);

	@Generated
	@Selector("replyAppleEventForSuspensionID:")
	public native NSAppleEventDescriptor replyAppleEventForSuspensionID(
			NSAppleEventManagerSuspensionID suspensionID);

	@Generated
	@Selector("resumeWithSuspensionID:")
	public native void resumeWithSuspensionID(
			NSAppleEventManagerSuspensionID suspensionID);

	@Generated
	@Selector("setCurrentAppleEventAndReplyEventWithSuspensionID:")
	public native void setCurrentAppleEventAndReplyEventWithSuspensionID(
			NSAppleEventManagerSuspensionID suspensionID);

	@Generated
	@Selector("setEventHandler:andSelector:forEventClass:andEventID:")
	public native void setEventHandlerAndSelectorForEventClassAndEventID(
			@Mapped(ObjCObjectMapper.class) Object handler,
			SEL handleEventSelector, int eventClass, int eventID);

	@Generated
	@Selector("sharedAppleEventManager")
	public static native NSAppleEventManager sharedAppleEventManager();

	@Generated
	@Selector("suspendCurrentAppleEvent")
	public native NSAppleEventManagerSuspensionID suspendCurrentAppleEvent();
}
