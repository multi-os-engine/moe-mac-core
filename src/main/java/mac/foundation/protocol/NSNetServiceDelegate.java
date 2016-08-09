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
import mac.foundation.*;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSNetServiceDelegate")
public interface NSNetServiceDelegate {
	@Generated
	@IsOptional
	@Selector("netService:didAcceptConnectionWithInputStream:outputStream:")
	public void netServiceDidAcceptConnectionWithInputStreamOutputStream(
			NSNetService sender, NSInputStream inputStream,
			NSOutputStream outputStream);

	@Generated
	@IsOptional
	@Selector("netService:didNotPublish:")
	public void netServiceDidNotPublish(NSNetService sender,
			NSDictionary errorDict);

	@Generated
	@IsOptional
	@Selector("netService:didNotResolve:")
	public void netServiceDidNotResolve(NSNetService sender,
			NSDictionary errorDict);

	@Generated
	@IsOptional
	@Selector("netService:didUpdateTXTRecordData:")
	public void netServiceDidUpdateTXTRecordData(NSNetService sender,
			NSData data);

	@Generated
	@IsOptional
	@Selector("netServiceDidPublish:")
	public void netServiceDidPublish(NSNetService sender);

	@Generated
	@IsOptional
	@Selector("netServiceDidResolveAddress:")
	public void netServiceDidResolveAddress(NSNetService sender);

	@Generated
	@IsOptional
	@Selector("netServiceDidStop:")
	public void netServiceDidStop(NSNetService sender);

	@Generated
	@IsOptional
	@Selector("netServiceWillPublish:")
	public void netServiceWillPublish(NSNetService sender);

	@Generated
	@IsOptional
	@Selector("netServiceWillResolve:")
	public void netServiceWillResolve(NSNetService sender);
}
