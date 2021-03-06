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

package mac.foundation.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class NSStreamEvent {
	@Generated
	private NSStreamEvent() {
	}

	@Generated
	public static final long None = 0x0000000000000000L;
	@Generated
	public static final long OpenCompleted = 0x0000000000000001L;
	@Generated
	public static final long HasBytesAvailable = 0x0000000000000002L;
	@Generated
	public static final long HasSpaceAvailable = 0x0000000000000004L;
	@Generated
	public static final long ErrorOccurred = 0x0000000000000008L;
	@Generated
	public static final long EndEncountered = 0x0000000000000010L;
}
