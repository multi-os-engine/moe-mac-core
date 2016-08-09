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


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSDraggingDestination")
public interface NSDraggingDestination {
	@Generated
	@IsOptional
	@Selector("concludeDragOperation:")
	public void concludeDragOperation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("draggingEnded:")
	public void draggingEnded(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("draggingEntered:")
	public long draggingEntered(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("draggingExited:")
	public void draggingExited(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("draggingUpdated:")
	public long draggingUpdated(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("performDragOperation:")
	public boolean performDragOperation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("prepareForDragOperation:")
	public boolean prepareForDragOperation(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("updateDraggingItemsForDrag:")
	public void updateDraggingItemsForDrag(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@IsOptional
	@Selector("wantsPeriodicDraggingUpdates")
	public boolean wantsPeriodicDraggingUpdates();
}
