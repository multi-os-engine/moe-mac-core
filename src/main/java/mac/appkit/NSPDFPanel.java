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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPDFPanel extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPDFPanel(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessoryController")
	public native NSViewController accessoryController();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPDFPanel alloc();

	@Generated
	@Selector("beginSheetWithPDFInfo:modalForWindow:completionHandler:")
	public native void beginSheetWithPDFInfoModalForWindowCompletionHandler(
			NSPDFInfo pdfInfo,
			NSWindow docWindow,
			@ObjCBlock(name = "call_beginSheetWithPDFInfoModalForWindowCompletionHandler") Block_beginSheetWithPDFInfoModalForWindowCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_beginSheetWithPDFInfoModalForWindowCompletionHandler {
		@Generated
		public void call_beginSheetWithPDFInfoModalForWindowCompletionHandler(
				long arg0);
	}

	@Generated
	@Selector("defaultFileName")
	public native String defaultFileName();

	@Generated
	@Selector("init")
	public native NSPDFPanel init();

	@Generated
	@Selector("options")
	public native long options();

	@Generated
	@Selector("panel")
	public static native NSPDFPanel panel();

	@Generated
	@Selector("setAccessoryController:")
	public native void setAccessoryController(NSViewController value);

	@Generated
	@Selector("setDefaultFileName:")
	public native void setDefaultFileName(String value);

	@Generated
	@Selector("setOptions:")
	public native void setOptions(long value);
}
