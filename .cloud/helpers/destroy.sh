#
# Copyright 2022 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
set -eo pipefail

helperDir="$(cd -P -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd -P)"
pushd "$helperDir/.." >/dev/null

# Execute 'predestroy.sh' scripts for any active modules
source ./helpers/common.sh
allModules=$(listAllModules)
activeModules=$(getActiveTerraformModules)
OLD_IFS="$IFS"
IFS=','
for module in $allModules; do
  friendlyName=$(getFriendlyOutputName "$module")
  if ! contains "$activeModules" "$friendlyName"; then
    continue # Skip unless active.
  fi

  if [[ -f "../$module/.cloud/predestroy.sh" ]]; then
    # shellcheck disable=SC1090
    source "../$module/.cloud/predestroy.sh"
  fi
done
IFS="$OLD_IFS"

terraform destroy -auto-approve
popd >/dev/null
