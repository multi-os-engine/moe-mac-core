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
public final class NSDataWritingOptions {
	@Generated
	private NSDataWritingOptions() {
	}

	@Generated
	public static final long NSDataWritingAtomic = 0x0000000000000001L;
	@Generated
	public static final long NSDataWritingWithoutOverwriting = 0x0000000000000002L;
	@Generated
	public static final long NSDataWritingFileProtectionNone = 0x0000000010000000L;
	@Generated
	public static final long NSDataWritingFileProtectionComplete = 0x0000000020000000L;
	@Generated
	public static final long NSDataWritingFileProtectionCompleteUnlessOpen = 0x0000000030000000L;
	@Generated
	public static final long NSDataWritingFileProtectionCompleteUntilFirstUserAuthentication = 0x0000000040000000L;
	@Generated
	public static final long NSDataWritingFileProtectionMask = 0x00000000F0000000L;
	@Generated
	public static final long NSAtomicWrite = 0x0000000000000001L;
}
