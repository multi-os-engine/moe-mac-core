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

package mac.foundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.NSDictionary;
import mac.foundation.NSNetService;
import mac.foundation.NSNetServiceBrowser;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSNetServiceBrowserDelegate")
public interface NSNetServiceBrowserDelegate {
	@Generated
	@IsOptional
	@Selector("netServiceBrowser:didFindDomain:moreComing:")
	public void netServiceBrowserDidFindDomainMoreComing(
			NSNetServiceBrowser aNetServiceBrowser, String domainString,
			boolean moreComing);

	@Generated
	@IsOptional
	@Selector("netServiceBrowser:didFindService:moreComing:")
	public void netServiceBrowserDidFindServiceMoreComing(
			NSNetServiceBrowser aNetServiceBrowser, NSNetService aNetService,
			boolean moreComing);

	@Generated
	@IsOptional
	@Selector("netServiceBrowser:didNotSearch:")
	public void netServiceBrowserDidNotSearch(
			NSNetServiceBrowser aNetServiceBrowser, NSDictionary errorDict);

	@Generated
	@IsOptional
	@Selector("netServiceBrowser:didRemoveDomain:moreComing:")
	public void netServiceBrowserDidRemoveDomainMoreComing(
			NSNetServiceBrowser aNetServiceBrowser, String domainString,
			boolean moreComing);

	@Generated
	@IsOptional
	@Selector("netServiceBrowser:didRemoveService:moreComing:")
	public void netServiceBrowserDidRemoveServiceMoreComing(
			NSNetServiceBrowser aNetServiceBrowser, NSNetService aNetService,
			boolean moreComing);

	@Generated
	@IsOptional
	@Selector("netServiceBrowserDidStopSearch:")
	public void netServiceBrowserDidStopSearch(
			NSNetServiceBrowser aNetServiceBrowser);

	@Generated
	@IsOptional
	@Selector("netServiceBrowserWillSearch:")
	public void netServiceBrowserWillSearch(
			NSNetServiceBrowser aNetServiceBrowser);
}
