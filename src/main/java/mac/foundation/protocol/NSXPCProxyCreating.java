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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSError;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSXPCProxyCreating")
public interface NSXPCProxyCreating {
	@Generated
	@Selector("remoteObjectProxy")
	@MappedReturn(ObjCObjectMapper.class)
	public Object remoteObjectProxy();

	@Generated
	@Selector("remoteObjectProxyWithErrorHandler:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object remoteObjectProxyWithErrorHandler(
			@ObjCBlock(name = "call_remoteObjectProxyWithErrorHandler") Block_remoteObjectProxyWithErrorHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_remoteObjectProxyWithErrorHandler {
		@Generated
		public void call_remoteObjectProxyWithErrorHandler(NSError arg0);
	}
}
