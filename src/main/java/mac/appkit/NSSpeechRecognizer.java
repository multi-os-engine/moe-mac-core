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
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSpeechRecognizer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSpeechRecognizer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSpeechRecognizer alloc();

	@Generated
	@Selector("blocksOtherRecognizers")
	public native boolean blocksOtherRecognizers();

	@Generated
	@Selector("commands")
	public native NSArray commands();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("displayedCommandsTitle")
	public native String displayedCommandsTitle();

	@Generated
	@Selector("init")
	public native NSSpeechRecognizer init();

	@Generated
	@Selector("listensInForegroundOnly")
	public native boolean listensInForegroundOnly();

	@Generated
	@Selector("setBlocksOtherRecognizers:")
	public native void setBlocksOtherRecognizers(boolean flag);

	@Generated
	@Selector("setCommands:")
	public native void setCommands(NSArray commands);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setDisplayedCommandsTitle:")
	public native void setDisplayedCommandsTitle(String title);

	@Generated
	@Selector("setListensInForegroundOnly:")
	public native void setListensInForegroundOnly(boolean flag);

	@Generated
	@Selector("startListening")
	public native void startListening();

	@Generated
	@Selector("stopListening")
	public native void stopListening();
}
