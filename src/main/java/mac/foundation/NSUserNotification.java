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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.NSImage;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUserNotification extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUserNotification(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("actionButtonTitle")
	public native String actionButtonTitle();

	@Generated
	@Selector("activationType")
	public native long activationType();

	@Generated
	@Selector("actualDeliveryDate")
	public native NSDate actualDeliveryDate();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUserNotification alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("deliveryDate")
	public native NSDate deliveryDate();

	@Generated
	@Selector("deliveryRepeatInterval")
	public native NSDateComponents deliveryRepeatInterval();

	@Generated
	@Selector("deliveryTimeZone")
	public native NSTimeZone deliveryTimeZone();

	@Generated
	@Selector("hasActionButton")
	public native boolean hasActionButton();

	@Generated
	@Selector("hasReplyButton")
	public native boolean hasReplyButton();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("informativeText")
	public native String informativeText();

	@Generated
	@Selector("init")
	public native NSUserNotification init();

	@Generated
	@Selector("isPresented")
	public native boolean isPresented();

	@Generated
	@Selector("isRemote")
	public native boolean isRemote();

	@Generated
	@Selector("otherButtonTitle")
	public native String otherButtonTitle();

	@Generated
	@Selector("response")
	public native NSAttributedString response();

	@Generated
	@Selector("responsePlaceholder")
	public native String responsePlaceholder();

	@Generated
	@Selector("setActionButtonTitle:")
	public native void setActionButtonTitle(String value);

	@Generated
	@Selector("setDeliveryDate:")
	public native void setDeliveryDate(NSDate value);

	@Generated
	@Selector("setDeliveryRepeatInterval:")
	public native void setDeliveryRepeatInterval(NSDateComponents value);

	@Generated
	@Selector("setDeliveryTimeZone:")
	public native void setDeliveryTimeZone(NSTimeZone value);

	@Generated
	@Selector("setHasActionButton:")
	public native void setHasActionButton(boolean value);

	@Generated
	@Selector("setHasReplyButton:")
	public native void setHasReplyButton(boolean value);

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	@Generated
	@Selector("setInformativeText:")
	public native void setInformativeText(String value);

	@Generated
	@Selector("setOtherButtonTitle:")
	public native void setOtherButtonTitle(String value);

	@Generated
	@Selector("setResponsePlaceholder:")
	public native void setResponsePlaceholder(String value);

	@Generated
	@Selector("setSoundName:")
	public native void setSoundName(String value);

	@Generated
	@Selector("setSubtitle:")
	public native void setSubtitle(String value);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String value);

	@Generated
	@Selector("setUserInfo:")
	public native void setUserInfo(NSDictionary value);

	@Generated
	@Selector("soundName")
	public native String soundName();

	@Generated
	@Selector("subtitle")
	public native String subtitle();

	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("userInfo")
	public native NSDictionary userInfo();

	@Generated
	@Selector("contentImage")
	public native NSImage contentImage();

	@Generated
	@Selector("setContentImage:")
	public native void setContentImage(NSImage value);
}
