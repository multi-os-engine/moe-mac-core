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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSError;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSOpenSavePanelDelegate")
public interface NSOpenSavePanelDelegate {
	@Generated
	@IsOptional
	@Selector("panel:didChangeToDirectoryURL:")
	public void panelDidChangeToDirectoryURL(
			@Mapped(ObjCObjectMapper.class) Object sender, NSURL url);

	@Generated
	@IsOptional
	@Selector("panel:shouldEnableURL:")
	public boolean panelShouldEnableURL(
			@Mapped(ObjCObjectMapper.class) Object sender, NSURL url);

	@Generated
	@IsOptional
	@Selector("panel:userEnteredFilename:confirmed:")
	public String panelUserEnteredFilenameConfirmed(
			@Mapped(ObjCObjectMapper.class) Object sender, String filename,
			boolean okFlag);

	@Generated
	@IsOptional
	@Selector("panel:validateURL:error:")
	public boolean panelValidateURLError(
			@Mapped(ObjCObjectMapper.class) Object sender, NSURL url,
			Ptr<NSError> outError);

	@Generated
	@IsOptional
	@Selector("panel:willExpand:")
	public void panelWillExpand(@Mapped(ObjCObjectMapper.class) Object sender,
			boolean expanding);

	@Generated
	@IsOptional
	@Selector("panelSelectionDidChange:")
	public void panelSelectionDidChange(
			@Mapped(ObjCObjectMapper.class) Object sender);
}
