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
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRulerView extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSRulerView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessoryView")
	public native NSView accessoryView();

	@Generated
	@Selector("addMarker:")
	public native void addMarker(NSRulerMarker marker);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSRulerView alloc();

	@Generated
	@Selector("baselineLocation")
	public native double baselineLocation();

	@Generated
	@Selector("clientView")
	public native NSView clientView();

	@Generated
	@Selector("drawHashMarksAndLabelsInRect:")
	public native void drawHashMarksAndLabelsInRect(@ByValue CGRect rect);

	@Generated
	@Selector("drawMarkersInRect:")
	public native void drawMarkersInRect(@ByValue CGRect rect);

	@Generated
	@Selector("init")
	public native NSRulerView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSRulerView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("initWithScrollView:orientation:")
	public native NSRulerView initWithScrollViewOrientation(
			NSScrollView scrollView, long orientation);

	@Generated
	@Selector("invalidateHashMarks")
	public native void invalidateHashMarks();

	@Generated
	@Selector("isFlipped")
	public native boolean isFlipped();

	@Generated
	@Selector("markers")
	public native NSArray markers();

	@Generated
	@Selector("measurementUnits")
	public native String measurementUnits();

	@Generated
	@Selector("moveRulerlineFromLocation:toLocation:")
	public native void moveRulerlineFromLocationToLocation(double oldLocation,
			double newLocation);

	@Generated
	@Selector("orientation")
	public native long orientation();

	@Generated
	@Selector("originOffset")
	public native double originOffset();

	@Generated
	@Selector("registerUnitWithName:abbreviation:unitToPointsConversionFactor:stepUpCycle:stepDownCycle:")
	public static native void registerUnitWithNameAbbreviationUnitToPointsConversionFactorStepUpCycleStepDownCycle(
			String unitName, String abbreviation, double conversionFactor,
			NSArray stepUpCycle, NSArray stepDownCycle);

	@Generated
	@Selector("removeMarker:")
	public native void removeMarker(NSRulerMarker marker);

	@Generated
	@Selector("requiredThickness")
	public native double requiredThickness();

	@Generated
	@Selector("reservedThicknessForAccessoryView")
	public native double reservedThicknessForAccessoryView();

	@Generated
	@Selector("reservedThicknessForMarkers")
	public native double reservedThicknessForMarkers();

	@Generated
	@Selector("ruleThickness")
	public native double ruleThickness();

	@Generated
	@Selector("scrollView")
	public native NSScrollView scrollView();

	@Generated
	@Selector("setAccessoryView:")
	public native void setAccessoryView(NSView accessory);

	@Generated
	@Selector("setClientView:")
	public native void setClientView(NSView client);

	@Generated
	@Selector("setMarkers:")
	public native void setMarkers(NSArray markers);

	@Generated
	@Selector("setMeasurementUnits:")
	public native void setMeasurementUnits(String unitName);

	@Generated
	@Selector("setOrientation:")
	public native void setOrientation(long orientation);

	@Generated
	@Selector("setOriginOffset:")
	public native void setOriginOffset(double offset);

	@Generated
	@Selector("setReservedThicknessForAccessoryView:")
	public native void setReservedThicknessForAccessoryView(double thickness);

	@Generated
	@Selector("setReservedThicknessForMarkers:")
	public native void setReservedThicknessForMarkers(double thickness);

	@Generated
	@Selector("setRuleThickness:")
	public native void setRuleThickness(double thickness);

	@Generated
	@Selector("setScrollView:")
	public native void setScrollView(NSScrollView scrollView);

	@Generated
	@Selector("trackMarker:withMouseEvent:")
	public native boolean trackMarkerWithMouseEvent(NSRulerMarker marker,
			NSEvent event);
}
