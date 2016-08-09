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

package mac.appkit.protocol;


import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGPoint;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSInputServerMouseTracker")
public interface NSInputServerMouseTracker {
	@Generated
	@Selector("mouseDownOnCharacterIndex:atCoordinate:withModifier:client:")
	public boolean mouseDownOnCharacterIndexAtCoordinateWithModifierClient(
			long theIndex, @ByValue CGPoint thePoint, long theFlags,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("mouseDraggedOnCharacterIndex:atCoordinate:withModifier:client:")
	public boolean mouseDraggedOnCharacterIndexAtCoordinateWithModifierClient(
			long theIndex, @ByValue CGPoint thePoint, long theFlags,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("mouseUpOnCharacterIndex:atCoordinate:withModifier:client:")
	public void mouseUpOnCharacterIndexAtCoordinateWithModifierClient(
			long theIndex, @ByValue CGPoint thePoint, long theFlags,
			@Mapped(ObjCObjectMapper.class) Object sender);
}
