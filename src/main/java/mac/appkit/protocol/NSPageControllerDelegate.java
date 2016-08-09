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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.NSPageController;
import mac.appkit.NSViewController;
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSPageControllerDelegate")
public interface NSPageControllerDelegate {
	@Generated
	@IsOptional
	@Selector("pageController:didTransitionToObject:")
	public void pageControllerDidTransitionToObject(
			NSPageController pageController,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@IsOptional
	@Selector("pageController:frameForObject:")
	@ByValue
	public CGRect pageControllerFrameForObject(NSPageController pageController,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@IsOptional
	@Selector("pageController:identifierForObject:")
	public String pageControllerIdentifierForObject(
			NSPageController pageController,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@IsOptional
	@Selector("pageController:prepareViewController:withObject:")
	public void pageControllerPrepareViewControllerWithObject(
			NSPageController pageController, NSViewController viewController,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@IsOptional
	@Selector("pageController:viewControllerForIdentifier:")
	public NSViewController pageControllerViewControllerForIdentifier(
			NSPageController pageController, String identifier);

	@Generated
	@IsOptional
	@Selector("pageControllerDidEndLiveTransition:")
	public void pageControllerDidEndLiveTransition(
			NSPageController pageController);

	@Generated
	@IsOptional
	@Selector("pageControllerWillStartLiveTransition:")
	public void pageControllerWillStartLiveTransition(
			NSPageController pageController);
}
