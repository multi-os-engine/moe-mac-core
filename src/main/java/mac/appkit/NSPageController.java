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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.NSAnimatablePropertyContainer;
import mac.foundation.NSArray;
import mac.foundation.NSBundle;
import mac.foundation.NSCoder;
import mac.foundation.NSDictionary;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPageController extends NSViewController implements
		NSAnimatablePropertyContainer, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPageController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPageController alloc();

	@Generated
	@Selector("animationForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object animationForKey(String key);

	@Generated
	@Selector("animations")
	public native NSDictionary animations();

	@Generated
	@Selector("animator")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object animator();

	@Generated
	@Selector("arrangedObjects")
	public native NSArray arrangedObjects();

	@Generated
	@Selector("completeTransition")
	public native void completeTransition();

	@Generated
	@Selector("defaultAnimationForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultAnimationForKey(String key);

	@Generated
	@ProtocolClassMethod("defaultAnimationForKey")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _defaultAnimationForKey(String key) {
		return defaultAnimationForKey(key);
	}

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSPageController init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native NSPageController initWithNibNameBundle(String nibNameOrNil,
			NSBundle nibBundleOrNil);

	@Generated
	@Selector("navigateBack:")
	public native void navigateBack(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("navigateForward:")
	public native void navigateForward(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("navigateForwardToObject:")
	public native void navigateForwardToObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("selectedIndex")
	public native long selectedIndex();

	@Generated
	@Selector("selectedViewController")
	public native NSViewController selectedViewController();

	@Generated
	@Selector("setAnimations:")
	public native void setAnimations(NSDictionary animations);

	@Generated
	@Selector("setArrangedObjects:")
	public native void setArrangedObjects(NSArray value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
		ObjCObject __old = (ObjCObject) delegate();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setSelectedIndex:")
	public native void setSelectedIndex(long value);

	@Generated
	@Selector("setTransitionStyle:")
	public native void setTransitionStyle(long value);

	@Generated
	@Selector("takeSelectedIndexFrom:")
	public native void takeSelectedIndexFrom(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("transitionStyle")
	public native long transitionStyle();
}
