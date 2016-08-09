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
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSData;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPICTImageRep extends NSImageRep {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPICTImageRep(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("PICTRepresentation")
	public native NSData PICTRepresentation();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPICTImageRep alloc();

	@Generated
	@Selector("boundingBox")
	@ByValue
	public native CGRect boundingBox();

	@Generated
	@Selector("imageRepClassForData:")
	public static native Class imageRepClassForData(NSData data);

	@Generated
	@Selector("imageRepClassForFileType:")
	public static native Class imageRepClassForFileType(String type);

	@Generated
	@Selector("imageRepClassForPasteboardType:")
	public static native Class imageRepClassForPasteboardType(String type);

	@Generated
	@Selector("imageRepClassForType:")
	public static native Class imageRepClassForType(String type);

	@Generated
	@Selector("imageRepWithContentsOfFile:")
	public static native NSPICTImageRep imageRepWithContentsOfFile(
			String filename);

	@Generated
	@Selector("imageRepWithContentsOfURL:")
	public static native NSPICTImageRep imageRepWithContentsOfURL(NSURL url);

	@Generated
	@Selector("imageRepWithData:")
	public static native NSPICTImageRep imageRepWithData(NSData pictData);

	@Generated
	@Selector("imageRepWithPasteboard:")
	public static native NSPICTImageRep imageRepWithPasteboard(
			NSPasteboard pasteboard);

	@Generated
	@Selector("imageRepsWithContentsOfFile:")
	public static native NSArray imageRepsWithContentsOfFile(String filename);

	@Generated
	@Selector("imageRepsWithContentsOfURL:")
	public static native NSArray imageRepsWithContentsOfURL(NSURL url);

	@Generated
	@Selector("imageRepsWithPasteboard:")
	public static native NSArray imageRepsWithPasteboard(NSPasteboard pasteboard);

	@Generated
	@Selector("init")
	public native NSPICTImageRep init();

	@Generated
	@Selector("initWithData:")
	public native NSPICTImageRep initWithData(NSData pictData);
}
