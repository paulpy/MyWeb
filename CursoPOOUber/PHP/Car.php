<?php
require_once 'Account.php'
class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license, Account $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    publicfunctionPrintDataCar(){
        echo"license: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}";
      }
}
?>