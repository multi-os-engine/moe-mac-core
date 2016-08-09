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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.protocol.NSPasteboardReading;
import mac.appkit.protocol.NSPasteboardWriting;
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.NSData;
import mac.foundation.NSURL;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSound extends NSObject implements NSCopying, NSCoding,
		NSPasteboardReading, NSPasteboardWriting {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSound(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSound alloc();

	@Generated
	@Selector("canInitWithPasteboard:")
	public static native boolean canInitWithPasteboard(NSPasteboard pasteboard);

	@Generated
	@Selector("channelMapping")
	public native NSArray channelMapping();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("currentTime")
	public native double currentTime();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("duration")
	public native double duration();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSSound init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithContentsOfFile:byReference:")
	public native NSSound initWithContentsOfFileByReference(String path,
			boolean byRef);

	@Generated
	@Selector("initWithContentsOfURL:byReference:")
	public native NSSound initWithContentsOfURLByReference(NSURL url,
			boolean byRef);

	@Generated
	@Selector("initWithData:")
	public native NSSound initWithData(NSData data);

	@Generated
	@Selector("initWithPasteboard:")
	public native NSSound initWithPasteboard(NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@Selector("initWithPasteboardPropertyList:ofType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithPasteboardPropertyListOfType(
			@Mapped(ObjCObjectMapper.class) Object propertyList, String type);

	@Generated
	@Selector("isPlaying")
	public native boolean isPlaying();

	@Generated
	@Selector("loops")
	public native boolean loops();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("pasteboardPropertyListForType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object pasteboardPropertyListForType(String type);

	@Generated
	@Selector("pause")
	public native boolean pause();

	@Generated
	@Selector("play")
	public native boolean play();

	@Generated
	@Selector("playbackDeviceIdentifier")
	public native String playbackDeviceIdentifier();

	@Generated
	@Selector("readableTypesForPasteboard:")
	public static native NSArray readableTypesForPasteboard(
			NSPasteboard pasteboard);

	@Generated
	@ProtocolClassMethod("readableTypesForPasteboard")
	public NSArray _readableTypesForPasteboard(NSPasteboard pasteboard) {
		return readableTypesForPasteboard(pasteboard);
	}

	@Generated
	@IsOptional
	@Selector("readingOptionsForType:pasteboard:")
	public static native long readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@ProtocolClassMethod("readingOptionsForTypePasteboard")
	public long _readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard) {
		return readingOptionsForTypePasteboard(type, pasteboard);
	}

	@Generated
	@Selector("resume")
	public native boolean resume();

	@Generated
	@Selector("setChannelMapping:")
	public native void setChannelMapping(NSArray channelMapping);

	@Generated
	@Selector("setCurrentTime:")
	public native void setCurrentTime(double seconds);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object aDelegate);

	@Generated
	@Selector("setLoops:")
	public native void setLoops(boolean val);

	@Generated
	@Selector("setName:")
	public native boolean setName(String string);

	@Generated
	@Selector("setPlaybackDeviceIdentifier:")
	public native void setPlaybackDeviceIdentifier(String deviceUID);

	@Generated
	@Selector("setVolume:")
	public native void setVolume(float volume);

	@Generated
	@Selector("soundNamed:")
	public static native NSSound soundNamed(String name);

	@Generated
	@Selector("soundUnfilteredFileTypes")
	public static native NSArray soundUnfilteredFileTypes();

	@Generated
	@Selector("soundUnfilteredPasteboardTypes")
	public static native NSArray soundUnfilteredPasteboardTypes();

	@Generated
	@Selector("soundUnfilteredTypes")
	public static native NSArray soundUnfilteredTypes();

	@Generated
	@Selector("stop")
	public native boolean stop();

	@Generated
	@Selector("volume")
	public native float volume();

	@Generated
	@Selector("writableTypesForPasteboard:")
	public native NSArray writableTypesForPasteboard(NSPasteboard pasteboard);

	@Generated
	@Selector("writeToPasteboard:")
	public native void writeToPasteboard(NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@Selector("writingOptionsForType:pasteboard:")
	public native long writingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);
}
