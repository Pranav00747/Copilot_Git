(defn installation_required[type_os]
( (cond 
     (= type_os "macOs")((exe_shell("brew install gh"))
     (= type_os "Windows")((exe_shell("choco install gh"))
                           )))
                           
 
