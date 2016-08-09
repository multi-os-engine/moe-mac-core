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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSharingService extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSharingService(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accountName")
	public native String accountName();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSharingService alloc();

	@Generated
	@Selector("alternateImage")
	public native NSImage alternateImage();

	@Generated
	@Selector("attachmentFileURLs")
	public native NSArray attachmentFileURLs();

	@Generated
	@Selector("canPerformWithItems:")
	public native boolean canPerformWithItems(NSArray items);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("init")
	public native NSSharingService init();

	@Generated
	@Selector("initWithTitle:image:alternateImage:handler:")
	public native NSSharingService initWithTitleImageAlternateImageHandler(
			String title,
			NSImage image,
			NSImage alternateImage,
			@ObjCBlock(name = "call_initWithTitleImageAlternateImageHandler") Block_initWithTitleImageAlternateImageHandler block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_initWithTitleImageAlternateImageHandler {
		@Generated
		public void call_initWithTitleImageAlternateImageHandler();
	}

	@Generated
	@Selector("menuItemTitle")
	public native String menuItemTitle();

	@Generated
	@Selector("messageBody")
	public native String messageBody();

	@Generated
	@Selector("performWithItems:")
	public native void performWithItems(NSArray items);

	@Generated
	@Selector("permanentLink")
	public native NSURL permanentLink();

	@Generated
	@Selector("recipients")
	public native NSArray recipients();

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
	@Selector("setMenuItemTitle:")
	public native void setMenuItemTitle(String value);

	@Generated
	@Selector("setRecipients:")
	public native void setRecipients(NSArray value);

	@Generated
	@Selector("setSubject:")
	public native void setSubject(String value);

	@Generated
	@Selector("sharingServiceNamed:")
	public static native NSSharingService sharingServiceNamed(String serviceName);

	@Generated
	@Selector("sharingServicesForItems:")
	public static native NSArray sharingServicesForItems(NSArray items);

	@Generated
	@Selector("subject")
	public native String subject();

	@Generated
	@Selector("title")
	public native String title();
}
