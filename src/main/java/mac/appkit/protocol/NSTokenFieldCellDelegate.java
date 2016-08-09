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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.NSMenu;
import mac.appkit.NSPasteboard;
import mac.appkit.NSTokenFieldCell;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTokenFieldCellDelegate")
public interface NSTokenFieldCellDelegate {
	@Generated
	@IsOptional
	@Selector("tokenFieldCell:completionsForSubstring:indexOfToken:indexOfSelectedItem:")
	public NSArray tokenFieldCellCompletionsForSubstringIndexOfTokenIndexOfSelectedItem(
			NSTokenFieldCell tokenFieldCell, String substring, long tokenIndex,
			LongPtr selectedIndex);

	@Generated
	@IsOptional
	@Selector("tokenFieldCell:displayStringForRepresentedObject:")
	public String tokenFieldCellDisplayStringForRepresentedObject(
			NSTokenFieldCell tokenFieldCell,
			@Mapped(ObjCObjectMapper.class) Object representedObject);

	@Generated
	@IsOptional
	@Selector("tokenFieldCell:editingStringForRepresentedObject:")
	public String tokenFieldCellEditingStringForRepresentedObject(
			NSTokenFieldCell tokenFieldCell,
			@Mapped(ObjCObjectMapper.class) Object representedObject);

	@Generated
	@IsOptional
	@Selector("tokenFieldCell:hasMenuForRepresentedObject:")
	public boolean tokenFieldCellHasMenuForRepresentedObject(
			NSTokenFieldCell tokenFieldCell,
			@Mapped(ObjCObjectMapper.class) Object representedObject);

	@Generated
	@IsOptional
	@Selector("tokenFieldCell:menuForRepresentedObject:")
	public NSMenu tokenFieldCellMenuForRepresentedObject(
			NSTokenFieldCell tokenFieldCell,
			@Mapped(ObjCObjectMapper.class) Object representedObject);

	@Generated
	@IsOptional
	@Selector("tokenFieldCell:readFromPasteboard:")
	public NSArray tokenFieldCellReadFromPasteboard(
			NSTokenFieldCell tokenFieldCell, NSPasteboard pboard);

	@Generated
	@IsOptional
	@Selector("tokenFieldCell:representedObjectForEditingString:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object tokenFieldCellRepresentedObjectForEditingString(
			NSTokenFieldCell tokenFieldCell, String editingString);

	@Generated
	@IsOptional
	@Selector("tokenFieldCell:shouldAddObjects:atIndex:")
	public NSArray tokenFieldCellShouldAddObjectsAtIndex(
			NSTokenFieldCell tokenFieldCell, NSArray tokens, long index);

	@Generated
	@IsOptional
	@Selector("tokenFieldCell:styleForRepresentedObject:")
	public long tokenFieldCellStyleForRepresentedObject(
			NSTokenFieldCell tokenFieldCell,
			@Mapped(ObjCObjectMapper.class) Object representedObject);

	@Generated
	@IsOptional
	@Selector("tokenFieldCell:writeRepresentedObjects:toPasteboard:")
	public boolean tokenFieldCellWriteRepresentedObjectsToPasteboard(
			NSTokenFieldCell tokenFieldCell, NSArray objects,
			NSPasteboard pboard);
}
