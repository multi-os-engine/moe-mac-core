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
import mac.appkit.protocol.NSTextLayoutOrientationProvider;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextContainer extends NSObject implements NSCoding,
		NSTextLayoutOrientationProvider {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextContainer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextContainer alloc();

	@Generated
	@Selector("containerSize")
	@ByValue
	public native CGSize containerSize();

	@Generated
	@Selector("containsPoint:")
	public native boolean containsPoint(@ByValue CGPoint point);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("heightTracksTextView")
	public native boolean heightTracksTextView();

	@Generated
	@Selector("init")
	public native NSTextContainer init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithContainerSize:")
	public native NSTextContainer initWithContainerSize(@ByValue CGSize size);

	@Generated
	@Selector("isSimpleRectangularTextContainer")
	public native boolean isSimpleRectangularTextContainer();

	@Generated
	@Selector("layoutManager")
	public native NSLayoutManager layoutManager();

	@Generated
	@Selector("layoutOrientation")
	public native long layoutOrientation();

	@Generated
	@Selector("lineFragmentPadding")
	public native double lineFragmentPadding();

	@Generated
	@Selector("lineFragmentRectForProposedRect:sweepDirection:movementDirection:remainingRect:")
	@ByValue
	public native CGRect lineFragmentRectForProposedRectSweepDirectionMovementDirectionRemainingRect(
			@ByValue CGRect proposedRect,
			long sweepDirection,
			long movementDirection,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect remainingRect);

	@Generated
	@Selector("replaceLayoutManager:")
	public native void replaceLayoutManager(NSLayoutManager newLayoutManager);

	@Generated
	@Selector("setContainerSize:")
	public native void setContainerSize(@ByValue CGSize size);

	@Generated
	@Selector("setHeightTracksTextView:")
	public native void setHeightTracksTextView(boolean flag);

	@Generated
	@Selector("setLayoutManager:")
	public native void setLayoutManager(NSLayoutManager layoutManager);

	@Generated
	@Selector("setLineFragmentPadding:")
	public native void setLineFragmentPadding(double pad);

	@Generated
	@Selector("setTextView:")
	public native void setTextView(NSTextView textView);

	@Generated
	@Selector("setWidthTracksTextView:")
	public native void setWidthTracksTextView(boolean flag);

	@Generated
	@Selector("textView")
	public native NSTextView textView();

	@Generated
	@Selector("widthTracksTextView")
	public native boolean widthTracksTextView();
}
