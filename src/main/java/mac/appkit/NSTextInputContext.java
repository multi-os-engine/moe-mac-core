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
public class NSTextInputContext extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextInputContext(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptsGlyphInfo")
	public native boolean acceptsGlyphInfo();

	@Generated
	@Selector("activate")
	public native void activate();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextInputContext alloc();

	@Generated
	@Selector("allowedInputSourceLocales")
	public native NSArray allowedInputSourceLocales();

	@Generated
	@Selector("client")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object client();

	@Generated
	@Selector("currentInputContext")
	public static native NSTextInputContext currentInputContext();

	@Generated
	@Selector("deactivate")
	public native void deactivate();

	@Generated
	@Selector("discardMarkedText")
	public native void discardMarkedText();

	@Generated
	@Selector("handleEvent:")
	public native boolean handleEvent(NSEvent theEvent);

	@Generated
	@Selector("init")
	public native NSTextInputContext init();

	@Generated
	@Selector("initWithClient:")
	public native NSTextInputContext initWithClient(
			@Mapped(ObjCObjectMapper.class) Object theClient);

	@Generated
	@Selector("invalidateCharacterCoordinates")
	public native void invalidateCharacterCoordinates();

	@Generated
	@Selector("keyboardInputSources")
	public native NSArray keyboardInputSources();

	@Generated
	@Selector("localizedNameForInputSource:")
	public static native String localizedNameForInputSource(
			String inputSourceIdentifier);

	@Generated
	@Selector("selectedKeyboardInputSource")
	public native String selectedKeyboardInputSource();

	@Generated
	@Selector("setAcceptsGlyphInfo:")
	public native void setAcceptsGlyphInfo(boolean value);

	@Generated
	@Selector("setAllowedInputSourceLocales:")
	public native void setAllowedInputSourceLocales(NSArray value);

	@Generated
	@Selector("setSelectedKeyboardInputSource:")
	public native void setSelectedKeyboardInputSource(String value);
}
