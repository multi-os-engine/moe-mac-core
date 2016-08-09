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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.NSSharingService;
import mac.appkit.NSSharingServicePicker;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSSharingServicePickerDelegate")
public interface NSSharingServicePickerDelegate {
	@Generated
	@IsOptional
	@Selector("sharingServicePicker:delegateForSharingService:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object sharingServicePickerDelegateForSharingService(
			NSSharingServicePicker sharingServicePicker,
			NSSharingService sharingService);

	@Generated
	@IsOptional
	@Selector("sharingServicePicker:didChooseSharingService:")
	public void sharingServicePickerDidChooseSharingService(
			NSSharingServicePicker sharingServicePicker,
			NSSharingService service);

	@Generated
	@IsOptional
	@Selector("sharingServicePicker:sharingServicesForItems:proposedSharingServices:")
	public NSArray sharingServicePickerSharingServicesForItemsProposedSharingServices(
			NSSharingServicePicker sharingServicePicker, NSArray items,
			NSArray proposedServices);
}
