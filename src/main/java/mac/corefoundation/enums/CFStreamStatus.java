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

package mac.corefoundation.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class CFStreamStatus {
	@Generated
	private CFStreamStatus() {
	}

	@Generated
	public static final long NotOpen = 0x0000000000000000L;
	@Generated
	public static final long Opening = 0x0000000000000001L;
	@Generated
	public static final long Open = 0x0000000000000002L;
	@Generated
	public static final long Reading = 0x0000000000000003L;
	@Generated
	public static final long Writing = 0x0000000000000004L;
	@Generated
	public static final long AtEnd = 0x0000000000000005L;
	@Generated
	public static final long Closed = 0x0000000000000006L;
	@Generated
	public static final long Error = 0x0000000000000007L;
}
