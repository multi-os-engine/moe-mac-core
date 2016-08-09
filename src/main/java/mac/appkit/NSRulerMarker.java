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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRulerMarker extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSRulerMarker(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSRulerMarker alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("drawRect:")
	public native void drawRect(@ByValue CGRect rect);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("imageOrigin")
	@ByValue
	public native CGPoint imageOrigin();

	@Generated
	@Selector("imageRectInRuler")
	@ByValue
	public native CGRect imageRectInRuler();

	@Generated
	@Selector("init")
	public native NSRulerMarker init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithRulerView:markerLocation:image:imageOrigin:")
	public native NSRulerMarker initWithRulerViewMarkerLocationImageImageOrigin(
			NSRulerView ruler, double location, NSImage image,
			@ByValue CGPoint imageOrigin);

	@Generated
	@Selector("isDragging")
	public native boolean isDragging();

	@Generated
	@Selector("isMovable")
	public native boolean isMovable();

	@Generated
	@Selector("isRemovable")
	public native boolean isRemovable();

	@Generated
	@Selector("markerLocation")
	public native double markerLocation();

	@Generated
	@Selector("representedObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object representedObject();

	@Generated
	@Selector("ruler")
	public native NSRulerView ruler();

	@Generated
	@Selector("setImage:")
	public native void setImage(NSImage image);

	@Generated
	@Selector("setImageOrigin:")
	public native void setImageOrigin(@ByValue CGPoint imageOrigin);

	@Generated
	@Selector("setMarkerLocation:")
	public native void setMarkerLocation(double location);

	@Generated
	@Selector("setMovable:")
	public native void setMovable(boolean flag);

	@Generated
	@Selector("setRemovable:")
	public native void setRemovable(boolean flag);

	@Generated
	@Selector("setRepresentedObject:")
	public native void setRepresentedObject(
			@Mapped(ObjCObjectMapper.class) Object representedObject);

	@Generated
	@Selector("thicknessRequiredInRuler")
	public native double thicknessRequiredInRuler();

	@Generated
	@Selector("trackMouse:adding:")
	public native boolean trackMouseAdding(NSEvent mouseDownEvent,
			boolean isAdding);
}
