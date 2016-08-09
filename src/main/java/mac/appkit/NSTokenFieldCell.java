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
import mac.foundation.NSCharacterSet;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTokenFieldCell extends NSTextFieldCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTokenFieldCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTokenFieldCell alloc();

	@Generated
	@Selector("completionDelay")
	public native double completionDelay();

	@Generated
	@Selector("defaultCompletionDelay")
	public static native double defaultCompletionDelay();

	@Generated
	@Selector("defaultTokenizingCharacterSet")
	public static native NSCharacterSet defaultTokenizingCharacterSet();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("init")
	public native NSTokenFieldCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSTokenFieldCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSTokenFieldCell initTextCell(String aString);

	@Generated
	@Selector("setCompletionDelay:")
	public native void setCompletionDelay(double delay);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setTokenStyle:")
	public native void setTokenStyle(long style);

	@Generated
	@Selector("setTokenizingCharacterSet:")
	public native void setTokenizingCharacterSet(NSCharacterSet characterSet);

	@Generated
	@Selector("tokenStyle")
	public native long tokenStyle();

	@Generated
	@Selector("tokenizingCharacterSet")
	public native NSCharacterSet tokenizingCharacterSet();
}
