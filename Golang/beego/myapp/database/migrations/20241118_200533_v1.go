package main

import (
	"github.com/beego/beego/v2/client/orm/migration"
)

// DO NOT MODIFY
type V1_20241118_200533 struct {
	migration.Migration
}

// DO NOT MODIFY
func init() {
	m := &V1_20241118_200533{}
	m.Created = "20241118_200533"

	migration.Register("V1_20241118_200533", m)
}

// Run the migrations
func (m *V1_20241118_200533) Up() {
	// use m.SQL("CREATE TABLE ...") to make schema update

}

// Reverse the migrations
func (m *V1_20241118_200533) Down() {
	// use m.SQL("DROP TABLE ...") to reverse schema update

}
