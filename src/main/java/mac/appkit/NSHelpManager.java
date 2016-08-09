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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.foundation.NSAttributedString;
import mac.foundation.NSBundle;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSHelpManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSHelpManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSHelpManager alloc();

	@Generated
	@Selector("contextHelpForObject:")
	public native NSAttributedString contextHelpForObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("findString:inBook:")
	public native void findStringInBook(String query, String book);

	@Generated
	@Selector("init")
	public native NSHelpManager init();

	@Generated
	@Selector("isContextHelpModeActive")
	public static native boolean isContextHelpModeActive();

	@Generated
	@Selector("openHelpAnchor:inBook:")
	public native void openHelpAnchorInBook(String anchor, String book);

	@Generated
	@Selector("registerBooksInBundle:")
	public native boolean registerBooksInBundle(NSBundle bundle);

	@Generated
	@Selector("removeContextHelpForObject:")
	public native void removeContextHelpForObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("setContextHelp:forObject:")
	public native void setContextHelpForObject(NSAttributedString attrString,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("setContextHelpModeActive:")
	public static native void setContextHelpModeActive(boolean active);

	@Generated
	@Selector("sharedHelpManager")
	public static native NSHelpManager sharedHelpManager();

	@Generated
	@Selector("showContextHelpForObject:locationHint:")
	public native boolean showContextHelpForObjectLocationHint(
			@Mapped(ObjCObjectMapper.class) Object object, @ByValue CGPoint pt);
}
